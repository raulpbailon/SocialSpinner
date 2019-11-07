package es.raulprieto.socialspinner;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import java.util.ArrayList;
import java.util.List;

import es.raulprieto.socialspinner.adapter.SocialAdapter;
import es.raulprieto.socialspinner.databinding.ActivityMainBinding;
import es.raulprieto.socialspinner.model.Social;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private SocialAdapter socialAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Link and personalize adapter to view
        socialAdapter = new SocialAdapter(this, getSocialList());
        socialAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spSocial.setAdapter(socialAdapter);

    }

    private List<Social> getSocialList() {
        List list = new ArrayList();

        list.add(new Social(R.drawable.ic_facebook, getString(R.string.facebook)));
        list.add(new Social(R.drawable.ic_google, getString(R.string.google)));
        list.add(new Social(R.drawable.ic_twitter, getString(R.string.twitter)));
        list.add(new Social(R.drawable.ic_instagram, getString(R.string.instagram)));
        list.add(new Social(R.drawable.ic_telegram, getString(R.string.telegram)));
        list.add(new Social(R.drawable.ic_github, getString(R.string.github)));
        list.add(new Social(R.drawable.ic_linkedin, getString(R.string.linkedin)));
        list.add(new Social(R.drawable.ic_spotify, getString(R.string.spotify)));
        list.add(new Social(R.drawable.ic_reddit, getString(R.string.reddit)));

        return list;
    }
}

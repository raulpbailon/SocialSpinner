package es.raulprieto.socialspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import es.raulprieto.socialspinner.adapter.SocialAdapter;
import es.raulprieto.socialspinner.databinding.ActivityMainBinding;
import es.raulprieto.socialspinner.model.Social;
import es.raulprieto.socialspinner.model.SocialComparator;

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

        binding.spSocial.setSelection(0, false);

        binding.spSocial.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), ((Social) parent.getItemAtPosition(position)).getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(parent.getContext(), "Nos bemo perro luego", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<Social> getSocialList() {
        List list = new ArrayList();

        list.add(new Social(R.drawable.ic_facebook, getString(R.string.facebook), 300, 400));
        list.add(new Social(R.drawable.ic_google, getString(R.string.google), 500, 8000));
        list.add(new Social(R.drawable.ic_twitter, getString(R.string.twitter), 100, 100));
        list.add(new Social(R.drawable.ic_instagram, getString(R.string.instagram), 1000, 3000));
        list.add(new Social(R.drawable.ic_telegram, getString(R.string.telegram), 300, 200));
        list.add(new Social(R.drawable.ic_github, getString(R.string.github), 400, 700));
        list.add(new Social(R.drawable.ic_linkedin, getString(R.string.linkedin), 800, 900));
        list.add(new Social(R.drawable.ic_spotify, getString(R.string.spotify), 200, 800));
        list.add(new Social(R.drawable.ic_reddit, getString(R.string.reddit), 300, 500));

        Collections.sort(list, new SocialComparator());
        return list;
    }
}

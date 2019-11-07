package es.raulprieto.socialspinner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import es.raulprieto.socialspinner.R;
import es.raulprieto.socialspinner.model.Social;

public class SocialAdapter extends ArrayAdapter<Social> {


    public SocialAdapter(@NonNull Context context, @NonNull List<Social> list) {
        super(context, R.layout.item_social, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        View view = convertView;

        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_social, parent, false);
            viewHolder.icon = view.findViewById(R.id.icon);
            viewHolder.tvName = view.findViewById(R.id.tvSocial);
            view.setTag(viewHolder);

        } else
            viewHolder = (ViewHolder) view.getTag();


        viewHolder.icon.setImageResource(getItem(position).getIconId());
        viewHolder.tvName.setText(getItem(position).getName());

        return view;
    }

    private static class ViewHolder {
        private ImageView icon;
        private TextView tvName;

    }
}

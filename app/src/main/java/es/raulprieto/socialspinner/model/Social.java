package es.raulprieto.socialspinner.model;

import androidx.annotation.NonNull;

public class Social {

    private int iconId;
    @NonNull
    private String name;

    public Social(int iconId, @NonNull String name) {
        this.iconId = iconId;
        this.name = name;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

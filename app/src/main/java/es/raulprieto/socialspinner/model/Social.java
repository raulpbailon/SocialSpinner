package es.raulprieto.socialspinner.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Objects;

/**
 * Represents a Social Network which objects will be ordered by their name
 * (natural order)
 */
public class Social implements Comparable<Social>{

    private int iconId;
    private String name;
    private int totalUsers;
    private int dollars;

    public Social(int iconId, String name, int totalUsers, int dollars) {
        this.iconId = iconId;
        this.name = name;
        this.totalUsers = totalUsers;
        this.dollars = dollars;
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

    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }

    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * This method is automatically called when using
     * a social data list/spinner
     *
     * <0   -->  The object is lower than the object received as parameter
     * ==0  -->  The object is equal to the object received as parameter
     * >0   -->  The object is greater than the object received as parameter
     * @param social network
     * @return
     */
    @Override
    public int compareTo(Social social) {
        return name.compareTo(social.name);
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return name.equals(((Social)obj).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

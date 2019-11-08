package es.raulprieto.socialspinner.model;

import java.util.Comparator;

/**
 * It's used a Comparator to sort 2 objects by one
 * or more criteria that aren't the natural order
 */
public class SocialComparator implements Comparator<Social> {

    @Override
    public int compare(Social s1, Social s2) {
        int ret;

        ret = Integer.compare(s1.getTotalUsers(), s2.getTotalUsers());

        if (ret == 0)
            // The comparison is made by a second criteria
            ret = Integer.compare(s1.getDollars(), s2.getDollars());

        return ret;
    }
}

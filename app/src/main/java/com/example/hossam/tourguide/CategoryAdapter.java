package com.example.hossam.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by hossam on 3/14/18.
 */

public class CategoryAdapter extends FragmentPagerAdapter
{
    private Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HistoricFragment();
            case 1:
                return new IslamicFragment();
            case 2:
                return new ChristianFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.category_historic_places);
            case 1:
                return context.getString(R.string.category_islamic_places);
            case 2:
                return context.getString(R.string.category_historic_places);
            default:
                return null;
        }
    }
}

package com.example.android.guidemi;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by MátéZoltán on 2017. 05. 15..
 */

public class PlacePagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    //Public constructor for the ViewPager Adapter
    public PlacePagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        //Set the Fragments as ViewPager items
        //And else is required!!
        if (position == 0){
            return new SightsFragment();
        }
        else if (position == 1){
            return new RestaurantsFragment();
        }
        else{
            return new MuseumsFragment();
        }
    }

    @Override
    public int getCount() {

        //Returns the number of items of the Viewpager
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Set the titles of the tabs for the TabLayout
        if (position == 0){
            return mContext.getString(R.string.sights);
        }
        else if (position == 1){
            return mContext.getString(R.string.restaurants);
        }
        else {
            return mContext.getString(R.string.museums);
        }
    }
}

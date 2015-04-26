package me.leisureapp.officialimplementingeffectivenavigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

/**
 * Created by lololol on 4/26/15.
 */
public class DemoCollectionPagerAdapter extends FragmentPagerAdapter {
    public DemoCollectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new DemoObjectFragment();
        Bundle args = new Bundle();
        args.putInt(DemoObjectFragment.ARG_OBJECT, i+1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT" + (position + 1);
    }
}

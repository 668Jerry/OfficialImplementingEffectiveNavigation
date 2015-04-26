package me.leisureapp.officialimplementingeffectivenavigation;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

/**
 * Created by lololol on 4/26/15.
 */
public class CollectionDemoActivity extends FragmentActivity {
    DemoCollectionPagerAdapter mDemoCollectionPagerAdapter;
    ViewPager mViewPager;
    // ViewPager is something like carousel

    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_collection_demo);

        mDemoCollectionPagerAdapter = new DemoCollectionPagerAdapter(getSupportFragmentManager());
        // FragmentPagerAdapter is built for viewPager to learn which is the current page.
        // FragmentPagerAdapter is something like UITabBarController
        mViewPager = (ViewPager)findViewById(R.id.pager);
        mViewPager.setAdapter(mDemoCollectionPagerAdapter);
    }
}

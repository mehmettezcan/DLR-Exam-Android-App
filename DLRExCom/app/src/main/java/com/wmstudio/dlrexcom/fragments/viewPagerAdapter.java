package com.wmstudio.dlrexcom.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class viewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragment_list = new ArrayList<>();
    private final List<String> fragment_list_titles = new ArrayList<>();

    public viewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragment_list.get(i);
    }

    @Override
    public int getCount() {
        return fragment_list_titles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragment_list_titles.get(position);
    }
    public void AddFragment(Fragment fragment, String title){
        fragment_list.add(fragment);
        fragment_list_titles.add(title);

    }
}

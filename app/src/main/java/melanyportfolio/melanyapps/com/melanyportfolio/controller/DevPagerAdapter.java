package melanyportfolio.melanyapps.com.melanyportfolio.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import melanyportfolio.melanyapps.com.melanyportfolio.view.AboutFragment;
import melanyportfolio.melanyapps.com.melanyportfolio.view.ContactFragment;
import melanyportfolio.melanyapps.com.melanyportfolio.view.SkillsFragment;
import melanyportfolio.melanyapps.com.melanyportfolio.view.WorkFragment;

public class DevPagerAdapter extends FragmentPagerAdapter {
    public DevPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new AboutFragment();
            case 1: return new WorkFragment();
            case 2: return new SkillsFragment();
            case 3: return new ContactFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "About";
            case 1: return "Work";
            case 2: return "Skills";
            case 3: return "Contact";
        }
        return super.getPageTitle(position);
    }
}

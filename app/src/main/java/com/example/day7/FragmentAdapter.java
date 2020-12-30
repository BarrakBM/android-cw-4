package com.example.day7;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.day7.Fragment.BlankFragment1;
import com.example.day7.Fragment.BlankFragment22;
import com.example.day7.Fragment.BlankFragment333;

public class FragmentAdapter extends FragmentPagerAdapter {


    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new BlankFragment1();

            case 1:
                return new BlankFragment22();

            case 2:
                return new BlankFragment333();
        }

        return getItem(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}

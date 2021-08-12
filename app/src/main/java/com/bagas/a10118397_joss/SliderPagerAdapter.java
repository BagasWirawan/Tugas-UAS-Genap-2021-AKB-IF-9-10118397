package com.bagas.a10118397_joss;
/*nama : bagas wirawan
  NIM : 10118397
  Kelas : IF9
  Tanggal : 02-August-2021 - 08-August-2021
* */


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class SliderPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragmentList;

    public SliderPagerAdapter(FragmentManager fm, List<Fragment> fragmentList){
        super(fm);
        this.fragmentList=fragmentList;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {return fragmentList.get(position);}
    public int getCount() {
        return fragmentList.size();
    }
}

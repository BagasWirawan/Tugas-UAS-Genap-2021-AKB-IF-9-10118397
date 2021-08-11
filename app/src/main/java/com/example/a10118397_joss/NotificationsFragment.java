package com.example.a10118397_joss;
/*nama : bagas wirawan
  NIM : 10118397
  Kelas : IF9
  Tanggal : 02-August-2021 - 08-August-2021
* */


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.a10118397_joss.Fragment1;
import com.example.a10118397_joss.Fragment2;
import com.example.a10118397_joss.Fragment3;
import com.example.a10118397_joss.R;
import com.example.a10118397_joss.SliderPagerAdapter;
import com.example.a10118397_joss.databinding.FragmentNotificationsBinding;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        List<Fragment> list = new ArrayList<>();
        list.add(new Fragment1());
        list.add(new Fragment2());
        list.add(new Fragment3());
        list.add(new Fragment4());
        pager = root.findViewById(R.id.pager);

        pagerAdapter = new SliderPagerAdapter(getActivity().getSupportFragmentManager(),list);
        pager.setAdapter(pagerAdapter);
        return root;
    }


}
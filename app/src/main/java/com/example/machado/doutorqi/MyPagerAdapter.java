package com.example.machado.doutorqi;

import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by machado on 30/06/15.
 */
public class MyPagerAdapter extends FragmentPagerAdapter{

    final int PAGE_COUNT = 2;
    private String tabTitles[] = new String[] {"Perfil", "Buscar"};
    private Context context;

    public MyPagerAdapter(FragmentManager fm, Context context){
        super(fm);
        this.context = context;

    }

    @Override
    public int getCount(){
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position){
        return PerfilFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}

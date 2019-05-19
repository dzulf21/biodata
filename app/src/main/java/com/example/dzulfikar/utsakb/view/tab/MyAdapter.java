package com.example.dzulfikar.utsakb.view.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;

import com.example.dzulfikar.utsakb.R;
import com.example.dzulfikar.utsakb.view.fragment.ContactFragment;
import com.example.dzulfikar.utsakb.view.fragment.FriendFragment;
import com.example.dzulfikar.utsakb.view.fragment.ProfileFragment;
import com.example.dzulfikar.utsakb.view.fragment.addFragment;


//Nama  : Dzulfikar Miandro Akbar S
//NIM   : 10116358
//KLS   : IF 8
//TGL   : 8 Mei 2019

public class MyAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private String[] titles ={"A","B","C","D"};
    int[] icon = new int[]{R.drawable.person,R.drawable.contact,R.drawable.friend,R.drawable.add};
    private int heightIcon;

    public MyAdapter(FragmentManager fm, Context c){
        super(fm);
        mContext = c;
        double scale = c.getResources().getDisplayMetrics().density;
        heightIcon=(int)(24*scale+0.5f);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag= null;

        if(position ==0){
            frag = new ProfileFragment();
        }else if(position == 1){
            frag = new ContactFragment();
        }else if(position == 2){
            frag = new FriendFragment();
        }else if(position == 3){
            frag = new addFragment();
        }

        Bundle b = new Bundle();
        b.putInt("position", position);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    public CharSequence getPageTitle(int position){
        Drawable d = mContext.getResources().getDrawable(icon[position]);
        d.setBounds(0,0,heightIcon,heightIcon);
        ImageSpan is = new ImageSpan(d);

        SpannableString sp = new SpannableString(" ");
        sp.setSpan(is,0,sp.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return sp;
    }

}


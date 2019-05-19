package com.example.dzulfikar.utsakb.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dzulfikar.utsakb.R;

//Nama  : Dzulfikar Miandro Akbar S
//NIM   : 10116358
//KLS   : IF 8
//TGL   : 8 Mei 2019

public class addFragment extends Fragment {
    public addFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false);
    }
}

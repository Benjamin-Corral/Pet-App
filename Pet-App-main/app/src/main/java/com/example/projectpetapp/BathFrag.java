package com.example.projectpetapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BathFrag extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private TextView LastBath, NextBath;

    private String mParam1;
    private String mParam2;

    public BathFrag() {
        // Required empty public constructor
    }

    public static BathFrag newInstance(String param1, String param2) {
        BathFrag fragment = new BathFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food, container,
                false);
        /*LastBath = view.findViewById(R.id.ResLast);
        NextBath = view.findViewById(R.id.ResNext);

        NextBath.setText(mParam1);
        LastBath.setText(mParam2);
*/
        return view;
    }
}
package com.example.projectpetapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FoodFrag extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private TextView FavFood;

    private String mParam1;

    public FoodFrag() {
        // Required empty public constructor
    }

    public static FoodFrag newInstance(String param1) {
        FoodFrag fragment = new FoodFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food, container,
                false);

        FavFood = view.findViewById(R.id.ResFood);
        FavFood.setText(mParam1);

        return view;
    }
}
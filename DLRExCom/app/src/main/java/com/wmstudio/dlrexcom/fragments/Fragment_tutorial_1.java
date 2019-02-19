package com.wmstudio.dlrexcom.fragments;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wmstudio.dlrexcom.R;

public class Fragment_tutorial_1 extends Fragment {
    View view;
    public Fragment_tutorial_1() {


    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_1,container,false);
        return view;
    }


}

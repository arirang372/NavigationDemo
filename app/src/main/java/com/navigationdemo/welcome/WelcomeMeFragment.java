package com.navigationdemo.welcome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.navigationdemo.R;

public class WelcomeMeFragment extends Fragment {

    EditText welcomeName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        welcomeName = view.findViewById(R.id.welcomeName);
        String name = getArguments().getString("myname");
        welcomeName.setText("Welcome " + name + " !");
    }
}

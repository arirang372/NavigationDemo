package com.navigationdemo.welcome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.navigationdemo.R;

public class WelcomeMeWithAgeFragment extends Fragment {
    TextView welcomewithNameandAge;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_welcome_with_age, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        welcomewithNameandAge = view.findViewById(R.id.welcomewithNameandAge);
        String name = getArguments().getString("myname");
        int age = getArguments().getInt("myage");
        welcomewithNameandAge.setText("Welcome " + name + " ! Your age is " + age);
    }

}

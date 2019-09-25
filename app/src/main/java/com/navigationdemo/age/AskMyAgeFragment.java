package com.navigationdemo.age;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.navigationdemo.R;

public class AskMyAgeFragment extends Fragment {
    private String name;
    private EditText helloEnterAge;
    private Button buttonWelcomeWithAge;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_age, container, false);
    }

    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        helloEnterAge = view.findViewById(R.id.helloEnterAge);
        buttonWelcomeWithAge = view.findViewById(R.id.buttonWelcomeWithAge);
        name = getArguments().getString("myname");
        helloEnterAge.setHint("Hello " + name + " What's your age?");
        buttonWelcomeWithAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = helloEnterAge.getText().toString();
                if (TextUtils.isEmpty(age)) {
                    helloEnterAge.setError("Please enter age");
                } else {
                    AskMyAgeFragmentDirections.ActionAgeFragmentToWelcomeWithAgeFragment action = AskMyAgeFragmentDirections.actionAgeFragmentToWelcomeWithAgeFragment();
                    action.setMyage(Integer.parseInt(age));
                    action.setMyname(name);
                    Navigation.findNavController(getActivity(), R.id.ageFragmentMain).navigate(action);
                }
            }
        });

    }
}

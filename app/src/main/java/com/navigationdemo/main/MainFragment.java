package com.navigationdemo.main;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.navigationdemo.R;

public class MainFragment extends Fragment {

    Button goToDetailFragment;
    Button goToSecondActivity;
    Button gotToAgeFragment;
    EditText editTextName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editTextName = view.findViewById(R.id.editTextName);
        goToDetailFragment = view.findViewById(R.id.goToDetailFragment);
        goToSecondActivity = view.findViewById(R.id.goToSecondActivity);
        gotToAgeFragment = view.findViewById(R.id.gotToAgeFragment);

        goToDetailFragment.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                if (TextUtils.isEmpty(name)) {
                    editTextName.setError("Please enter a name");
                } else {
                    MainFragmentDirections.ActionListToDetail action = MainFragmentDirections.actionListToDetail();
                    action.setMyname(name);
                    new NavController(getActivity()).navigate(action);
                }
            }
        });

        goToSecondActivity.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                if (TextUtils.isEmpty(name)) {
                    editTextName.setError("Please enter a name");
                } else {
                    MainFragmentDirections.ActionMainToSecondActivity action = MainFragmentDirections.actionMainToSecondActivity();
                    action.setMyname(name);
                    new NavController(getActivity()).navigate(action);
                }
            }
        });

        gotToAgeFragment.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                if (TextUtils.isEmpty(name)) {
                    editTextName.setError("Please enter a name");
                } else {
                    MainFragmentDirections.ActionMainFragmentToAgeFragment action = MainFragmentDirections.actionMainFragmentToAgeFragment();
                    action.setMyname(name);
                    new NavController(getActivity()).navigate(action);
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        editTextName.setText("");
    }

}

package com.navigationdemo.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.navigationdemo.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        NavHostFragment host = NavHostFragment.create(R.navigation.welcome_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, host)
                .setPrimaryNavigationFragment(host)
                .commit();
    }

    @Override
    public boolean onSupportNavigateUp() {
        return Navigation.findNavController(this, R.id.container).navigateUp();
    }
}

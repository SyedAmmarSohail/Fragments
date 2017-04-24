package com.example.ammar.multifragmentscreen.outScreen;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ammar.multifragmentscreen.R;

public class MainActivityIn extends AppCompatActivity implements FragmentA.OnFragmentInteractionListener {

    FragmentA fa;
    FragmentB fb;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main_inscreen);

        manager = getSupportFragmentManager();
        fa = (FragmentA) manager.findFragmentById(R.id.fragment2);
        fa.setOnFragmentInteractionListener(this);
    }

    @Override
    public void onFragmentInteraction(int index) {
        fb = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragment3);
        fb.description(index);
    }

}

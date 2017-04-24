package com.example.ammar.multifragmentscreen.inScreen;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.ammar.multifragmentscreen.R;

public class MainActivityOut extends AppCompatActivity implements FragmentA.OnFragmentInteractionListener {

    FragmentA fa;
    FragmentB fb;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main_outscreen);

        fa = new FragmentA();
        getSupportFragmentManager().beginTransaction().replace(R.id.rl, fa, "Fa").commit();

        manager = getSupportFragmentManager();
        /*fa = (FragmentA) manager.findFragmentById(R.id.fragment);*/
        fa.setOnFragmentInteractionListener(this);
    }

    @Override
    public void onFragmentInteraction(int index) {
        fb = new FragmentB();
        Bundle b = new Bundle();
        b.putInt("index", index);
        fb.setArguments(b);
        getSupportFragmentManager().beginTransaction().replace(R.id.rl, fb, "Fb").addToBackStack(null).commit();
    }

}

package com.example.ammar.multifragmentscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ammar.multifragmentscreen.inScreen.MainActivityOut;
import com.example.ammar.multifragmentscreen.outScreen.MainActivityIn;

/**
 * Created by ammar on 4/22/17.
 */

public class Multifragment extends Activity implements View.OnClickListener {

    TextView btnInScreen, btnOutScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multi_fragment);

        initialize();

        listener();
    }

    private void initialize() {
        btnInScreen = (TextView) findViewById(R.id.btnInScreen);
        btnOutScreen = (TextView) findViewById(R.id.btnOutScreen);
    }

    private void listener() {
        btnInScreen.setOnClickListener(this);
        btnOutScreen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnInScreen:
                startActivity(new Intent(this, MainActivityIn.class));
                break;
            case R.id.btnOutScreen:
                startActivity(new Intent(this, MainActivityOut.class));
                break;
        }
    }
}

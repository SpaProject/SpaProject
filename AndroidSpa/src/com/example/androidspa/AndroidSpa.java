package com.example.androidspa;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AndroidSpa extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.androidspa);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.androidspa, menu);
        return true;
    }
}

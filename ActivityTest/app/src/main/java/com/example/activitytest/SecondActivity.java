package com.example.activitytest;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("1111", "B - onCreate()");
        TextView txt = (TextView) this.findViewById(R.id.txt);
        txt.setText("B");
        Button btn = (Button) this.findViewById(R.id.btn);
        btn.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("1111", "B - onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("1111", "B - onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("1111", "B - onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("1111", "B - onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("1111", "B - onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("1111", "B - onRestart()");
    }
}


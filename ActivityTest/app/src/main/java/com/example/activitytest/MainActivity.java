package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("1111", "A - onCreate()");
        TextView txt = (TextView) this.findViewById(R.id.txt);
        txt.setText("A");
        Button btn = (Button) this.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("1111", "A - onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("1111", "A - onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("1111", "A - onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("1111", "A - onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("1111", "A - onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("1111", "A - onRestart()");
    }
}
package com.example.niklocal.lifecycletoast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tToast("onCreate Toast");
    }

    public void onStart() {
        super.onStart();
        tToast("onStart Toast");
    }

    public void onRestart() {
        super.onRestart();
        tToast("onRestart Toast");
    }

    public void onResume() {
        super.onResume();
        tToast("onResume Toast");
    }

    public void onPause() {
        super.onPause();
        tToast("onPause: bye bye! Plz Come back");
    }

    public void onStop() {
        super.onStop();
        tToast("onStop Toast Rate 5 Star");
    }

    public void onDestroy() {
        super.onStop();
        tToast("onDestroy Toast");
    }

    private void tToast(String s) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, s, duration);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }
}
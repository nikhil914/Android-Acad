package com.example.niklocal.loginsharedpref;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class view extends AppCompatActivity {


    TextView savedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        SharedPreferences sharedPreferences=getSharedPreferences("MySharedPrefs",MODE_PRIVATE);

        String displayText=sharedPreferences.getString("display","");
        savedText=(TextView)findViewById(R.id.textView);

        savedText.setText(displayText);







    }
}
package com.example.admin.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView dpTV,passText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_main);

        dpTV=(TextView)findViewById(R.id.displayText);
        passText=(TextView)findViewById(R.id.passText);

        Intent i=getIntent();
        String username=i.getStringExtra("user");
        String password=i.getStringExtra("pass");

        dpTV.setText(dpTV.getText() + username);
        passText.setText(passText.getText() + password);

    }
}

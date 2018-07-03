package com.example.niklocal.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    private EditText id;
    private EditText password;

    public Button button;
    public void init() {
        button = (Button) findViewById(R.id.button);
        id =(EditText)findViewById(R.id.eid);
        password =(EditText)findViewById(R.id.pass);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(id.getText().toString(),password.getText().toString());
            }
        });
    }
    private  void validate(String usernmae,String password){
        if ((usernmae.equals("nik")) && (password.equals("123"))){
            Intent xyz=new Intent(MainActivity.this,second.class);
            startActivity(xyz);
        }
        else makeText(getApplicationContext(), "Wrong Username and password", LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}

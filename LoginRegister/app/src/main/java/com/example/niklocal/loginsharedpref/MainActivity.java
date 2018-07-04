package com.example.niklocal.loginsharedpref;

import android.content.Intent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome;
    EditText username,password;
    Button regBtn,logBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome=(TextView)findViewById(R.id.tv1);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        regBtn=(Button)findViewById(R.id.registerBtn);
        logBtn=(Button)findViewById(R.id.loginBtn);

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();

                SharedPreferences sharedPreferences=getSharedPreferences("MySharedPrefs",MODE_PRIVATE);
                String details= sharedPreferences.getString(user + pass + "data"  ,"Username or Password is incorrect" );

                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("display",details);

                editor.commit();
                Intent i=new Intent(MainActivity.this,view.class);
                startActivity(i);
            }
        });


        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(MainActivity.this,signup.class);
                startActivity(i2);
            }
        });
    }
}
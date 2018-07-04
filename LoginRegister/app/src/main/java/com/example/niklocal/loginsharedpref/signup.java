package com.example.niklocal.loginsharedpref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    TextView regText;
    EditText username,password,email;
    Button newUserBtn;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        regText=(TextView)findViewById(R.id.RegisterText);
        username=(EditText)findViewById(R.id.regUserText);
        password=(EditText)findViewById(R.id.regPassText);
        email=(EditText)findViewById(R.id.regEmailText);
        newUserBtn=(Button)findViewById(R.id.buttonRegister);

        newUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPreferences=getSharedPreferences("MySharedPrefs",MODE_PRIVATE);
                String newUser=username.getText().toString();
                String newPass=password.getText().toString();


                SharedPreferences.Editor editor= sharedPreferences.edit();
                editor.putString(newUser + newPass + "data","Username : "+newUser + "\n" + "Password : "+newPass);

                editor.commit();


                Toast.makeText(getApplicationContext(),"Successfully Registered.",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(signup.this,MainActivity.class);

                startActivity(intent);
            }
        });


    }
}

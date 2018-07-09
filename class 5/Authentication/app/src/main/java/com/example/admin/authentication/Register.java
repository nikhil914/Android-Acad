package com.example.admin.authentication;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
Button register;
EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username=(EditText)findViewById(R.id.uid);
        password=(EditText)findViewById(R.id.upass);
        register=(Button)findViewById(R.id.button);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString();
                String pass = password.getText().toString();
                registerMethod(user, pass);
            }
});
        }

    void  registerMethod(String user,String pass){

        SQLiteDatabase sqLiteDatabase=this.openOrCreateDatabase("userDB",MODE_PRIVATE,null);
        sqLiteDatabase.execSQL("create table if not exists users (uname VARCHAR,pass VARCHAR)");





        sqLiteDatabase.execSQL("insert into users values('" + user + "','" + pass + "')");
        Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_SHORT).show();



    }
    }


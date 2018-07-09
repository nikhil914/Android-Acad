package com.example.admin.authentication;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Textview;
    EditText username,password;
    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Textview=(TextView)findViewById(R.id.Textview);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.logBtn);
        register=(Button)findViewById(R.id.regBtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                loginMethod(user,pass);

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(MainActivity.this,Register.class);
                startActivity(in);

            }
        });
   }

    void loginMethod(String user,String pass){

        try {
            SQLiteDatabase sqLiteDatabase= this.openOrCreateDatabase("userDB",MODE_PRIVATE,null);
            Cursor c= sqLiteDatabase.rawQuery("select * from users where uname='"+user+"'",null);
            int userIndex= c.getColumnIndex("uname");
            int passIndex= c.getColumnIndex("pass");

            c.moveToFirst();

            String realPass= c.getString(passIndex);
            if(realPass.equals(pass)){
                Log.i("LOGIN","Successful");

                Toast.makeText(getApplicationContext(),"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(getApplicationContext(),DisplayActivity.class);
                intent.putExtra("user",user);
                intent.putExtra("pass",pass);
                startActivity(intent);


            }else{
                Log.i("LOGIN","NOT SUCCESSFUL");
                Toast.makeText(MainActivity.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}

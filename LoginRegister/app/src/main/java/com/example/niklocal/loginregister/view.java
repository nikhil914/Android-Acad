package com.example.niklocal.loginregister;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.niklocal.loginregister.R.id.a1;
import static com.example.niklocal.loginregister.R.id.editemail;
import static com.example.niklocal.loginregister.R.id.editfirstname;
import static com.example.niklocal.loginregister.R.id.editlastname;
import static com.example.niklocal.loginregister.R.id.editmobileno;

public class view extends AppCompatActivity {
    public class RegisterActivity extends Activity {

        TextView fname, lname, mobile, email;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_view);

            fname = (TextView) findViewById(R.id.a1);
            lname = (TextView) findViewById(R.id.a2);
            mobile = (TextView) findViewById(R.id.a3);
            email = (TextView) findViewById(R.id.a4);

            SharedPreferences ab = getSharedPreferences("Pref", MODE_PRIVATE);
            final String a = ab.getString(String.valueOf(editfirstname),null);
            final String b = ab.getString(String.valueOf(editlastname),null);
            final String c = ab.getString(String.valueOf(editmobileno),null);
            final String d = ab.getString(String.valueOf(editemail),null);

            fname.setText(a);
            lname.setText(b);
            mobile.setText(c);
            email.setText(d);


        }
    }
}

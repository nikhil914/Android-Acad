package com.example.niklocal.notepad;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class create extends AppCompatActivity {

    EditText text;
    Button save;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_create);


        text=(EditText)findViewById(R.id.text);
        save=(Button)findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Note=text.getText().toString();

                NoteAdd(Note);
            }
        });
    }

    void NoteAdd(String notes){

        try {
            SQLiteDatabase db = this.openOrCreateDatabase("notesDB", MODE_PRIVATE, null);
            db.execSQL("create table if not exists list (notetext VARCHAR)");


            db.execSQL("insert into list values('" + notes + "')");
            Log.i("notes", "Success");
            Toast.makeText(getApplicationContext(), "Added successfully!!!", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


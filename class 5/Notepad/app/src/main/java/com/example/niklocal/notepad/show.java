package com.example.niklocal.notepad;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class show extends AppCompatActivity {

    ArrayList<String> notes;

    ListView xyz;

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        xyz=(ListView)findViewById(R.id.list);

        getNotes();

    }

    void getNotes(){

        notes= new ArrayList<String >();
        try{
            SQLiteDatabase db=this.openOrCreateDatabase("notesDB",MODE_PRIVATE,null);
            Cursor x=db.rawQuery("select * from list ",null);
            int noteIndex= x.getColumnIndex("notetext");
            x.moveToFirst();
            while (x!=null){

                Log.i("Notes",x.getString(noteIndex));
                notes.add(x.getString(noteIndex));
                x.moveToNext();

            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {


            arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, notes);
            xyz.setAdapter(arrayAdapter);

        }
    }
}

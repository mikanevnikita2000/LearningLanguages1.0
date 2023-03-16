package com.example.learninglanguages10;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.room.Room;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.example.learninglanguages10.DB.AppDB;
import com.example.learninglanguages10.DB.Words;

import java.util.ArrayList;
import java.util.List;

public class AddFragment extends Fragment {

    EditText levelAdd, wordAdd, translationAdd, languageAdd;
    Button buttonAdd;
    List<Words> list = new ArrayList<>();
    private AppDB database;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        database = AppDB.create(this, false);
        View viewReturn = inflater.inflate(R.layout.fragment_add, container, false);
        //initDB();
        levelAdd = (EditText) viewReturn.findViewById(R.id.levelAdd);
        wordAdd = (EditText) viewReturn.findViewById(R.id.word);
        translationAdd = (EditText) viewReturn.findViewById(R.id.translationAdd);
        languageAdd = (EditText) viewReturn.findViewById(R.id.language);
        buttonAdd = (Button) viewReturn.findViewById(R.id.buttonAdd);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Words words = new Words();
//                words.level = levelAdd.getText().toString();
//                words.word = wordAdd.getText().toString();
//                words.translation = translationAdd.getText().toString();
//                words.language = languageAdd.getText().toString();
//                addItem(words);
//                updateItem(words);
            }
        });
        return viewReturn;
    }

    public Object getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(Object applicationContext) {
        this.applicationContext = applicationContext;
    }

//    public void setCursorInUIThread(Cursor cursor)
//    {
//        Context context = getContext();
//        runOnUiThread(new Runnable()
//        {
//            @Override
//            public void run() {
//                SimpleCursorAdapter adapter = new SimpleCursorAdapter(context, R.layout.fragment_add, cursor, cursor.getColumnNames(), new int[]{R.id.levelAdd, R.id.translationAdd, R.id.word, R.id.language}, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
//                Log.d("mytag", "Records in adapter: "+ adapter.getCount());
//                ListView lv = findViewById(R.id.);
//            }
//        });
//    }


//    private void initDB() {
//        database = Room.databaseBuilder(getContext(),
//                        AppDB.class, "words")
//                .fallbackToDestructiveMigration()
//                .build();
//    }
//
//    public void addItem(Words words){
//        list.add(words);
//        Thread thread = new Thread(new Runnable() {
//            public void run() {
//                database.wordsDao().insert(words);
//            }
//        });
//        thread.start();
//    }
//
//    private void updateItem(Words words){
//        Thread thread = new Thread(new Runnable() {
//            public void run() {
//                database.wordsDao().update(words);
//            }
//        });
//        thread.start();
//    }
}
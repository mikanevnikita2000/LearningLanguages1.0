package com.example.learninglanguages10.DB;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.content.Context;

import com.example.learninglanguages10.AddFragment;

@Database(entities = {Words.class}, version = 2)
public abstract class AppDB extends RoomDatabase{

    public abstract WordsDao wordsDao();

    private  static final  String DB_NAME="words.db";
    private  static  volatile AppDB INSTANCE=null;

//    synchronized static AppDB get(Context ctxt)
//    {
//        if(INSTANCE == null)
//        {
//            INSTANCE = create(ctxt, false);
//        }
//        return(INSTANCE);
//    }
    public static AppDB create(AddFragment ctxt, boolean memoryOnly)
    {
        RoomDatabase.Builder<AppDB> b;
        if(memoryOnly)
        {
            b = Room.inMemoryDatabaseBuilder(ctxt.getApplicationContext(), AppDB.class);
        }
        else 
        {
            b = Room.databaseBuilder(ctxt.getApplicationContext(), AppDB.class, DB_NAME);
        }
        return (b.build());
    }
}

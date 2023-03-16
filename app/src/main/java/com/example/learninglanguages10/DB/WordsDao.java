package com.example.learninglanguages10.DB;



import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;


import java.util.List;

@Dao
interface WordsDao {
    @Query("SELECT * FROM words")
    List<Words> getAll();

    @Insert
    void insert(Words... words);

    @Update
    void update(Words... words);
}

package com.example.learninglanguages10.DB;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "words")
public class Words {

    @PrimaryKey
    int _id;

    String word;

    String translation;

    String language;

    String level;

    public Words (String level, String word, String translation, String language)
    {
        this.word = word;
        this.translation = translation;
        this.language = language;
        this.level = level;
    }

//    public long getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getWord() {
//        return word;
//    }
//    public void setWord(String word) {
//        this.word = word;
//    }
//
//    public String getTranslation() {
//        return translation;
//    }
//    public void setTranslation(String translation) {
//        this.translation = translation;
//    }
//
//    public String getLanguage() {
//        return language;
//    }
//    public void setLanguage(String language) {
//        this.language = language;
//    }
//
//    public String getLevel() {
//        return level;
//    }
//    public void setLevel(String level) {
//        this.level = level;
//    }


}

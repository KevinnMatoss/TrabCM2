package com.example.trabcm;

import androidx.annotation.NonNull;



@Entity(tablename = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;
    public Word(@NonNull String word) {this.mWord = word;}
    public String getWord(){return this.mWord;}
}




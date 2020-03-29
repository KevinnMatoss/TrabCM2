package com.example.trabcm;

import androidx.annotation.NonNull;

public class Word {
    private String mWord;
    public Word(@NonNull String word) {this.mWord = word;}
    public String getWord(){return this.mWord;}
}

@Entity(tableName = "word_table")
public class Word{
    @PrimaryKey
    @NonNull
    @CollumnInfo(name = "word")
    private String mWord;

    public Word(@NonNull Stro)
}

package com.example.trabcm;

import androidx.lifecycle.LiveData;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("Select * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();
}

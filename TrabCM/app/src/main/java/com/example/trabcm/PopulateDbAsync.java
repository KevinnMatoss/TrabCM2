package com.example.trabcm;

import android.os.AsyncTask;

public class PopulateDbAsync extends AsyncTask<Void, Void, Void> {
    private final WordDao mDao;
    String[] words = {"dolphin", "crocodile", "cobra"};

    PopulateDbAsync(WordRoomDatabase db) {
        mDao = db.wordDao();
    }

    @Override
    protected Void doInBackground(final Void... params) {
        mDao.deleteAll();

        for (int i = 0; i <= words.length - 1; i++) {
            Word word = new Word(words[i]);
            mDao.insert(word);
        }
        return null;
    }
}

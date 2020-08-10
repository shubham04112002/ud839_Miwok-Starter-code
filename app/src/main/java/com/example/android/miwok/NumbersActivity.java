package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("ONE","EK",R.drawable.number_one));
        words.add(new Word("TWO","DO",R.drawable.number_two));
        words.add(new Word("THREE","TEEN",R.drawable.number_three));
        words.add(new Word("FOUR","CHAAR",R.drawable.number_four));
        words.add(new Word("FIVE","PAANCH",R.drawable.number_five));
        words.add(new Word("SIX","CHE",R.drawable.number_six));
        words.add(new Word("SEVEN","SAAT",R.drawable.number_seven));
        words.add(new Word("EIGHT","NINE",R.drawable.number_eight));
        words.add(new Word("NINE","NOA",R.drawable.number_nine));
        words.add(new Word("TEN","DAS",R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }

}

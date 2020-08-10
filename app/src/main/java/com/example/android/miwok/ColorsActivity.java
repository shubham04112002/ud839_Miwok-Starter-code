package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("SAFED","WHITE",R.drawable.color_white));
        words.add(new Word("KAALA","BLACK",R.drawable.color_black));
        words.add(new Word("JYADA PEELA","MUSTARD YELLOW",R.drawable.color_mustard_yellow));
        words.add(new Word("HARA","GREEN",R.drawable.color_green));
        words.add(new Word("PILA","YELLOW",R.drawable.color_mustard_yellow));
        words.add(new Word("KALA GORA","GREY",R.drawable.color_gray));
        words.add(new Word("LAAL","RED",R.drawable.color_red));
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

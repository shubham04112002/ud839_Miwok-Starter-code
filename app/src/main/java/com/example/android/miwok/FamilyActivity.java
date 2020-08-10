package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("MAA","MOM",R.drawable.family_mother));
        words.add(new Word("PITA","DAD",R.drawable.family_father));
        words.add(new Word("BADI BEHEN","OLDER SISTER",R.drawable.family_older_sister));
        words.add(new Word("BADA BHAI","OLDER BROTHER",R.drawable.family_older_brother));
        words.add(new Word("DADA","GRANDFATHER",R.drawable.family_grandfather));
        words.add(new Word("DADI","GRANDMOTHER",R.drawable.family_grandmother));
        words.add(new Word("BETI","DAUGHTER",R.drawable.family_daughter));
        words.add(new Word("BETA","SON",R.drawable.family_son));
        words.add(new Word("CHOTA BHAI","YOUNGER BROTHER",R.drawable.family_younger_brother));
        words.add(new Word("CHOTI BEHEN","YOUNGER SISTER",R.drawable.family_younger_sister));
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView =  (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}

package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("HAATH KANGHAN KO AARSI KYA ","LIVE INCIDENTS DO NOT NEED PROOF"));
        words.add(new Word("TAB PAACHTAVE KYA HOE JAB CHIDIYA CHUGH GAYI KHET ","NO BENIFIT OF SORROW AFTER LOSS HAS BEEN MADE"));
        words.add(new Word("SOU CHUE KHAKE BILLI HAJH KO CHALI","AFTER DOING THE CRIME AND ACTING TO BE THE INNOCENT PERSON IN THE GALAXY"));
        words.add(new Word("NAACH NA JAANE AANGAN TEDHA ","SHIFTING THEIR INCOMPETENCE TO OTHERS"));
        words.add(new Word("GHAR KA BHEDI LANKA DHAAYE","THE ONE WHO IS CLOSE TO US THE MOST,SOMETIME BECOMES THE CAUSE OF OUR DESTRUCTION"));
        words.add(new Word("IIT SE IIT BAJANA","TO RETALIATE WITH FULL FORCE"));
        words.add(new Word("SAU SUNHAR KI EK LUHAAR KI","AN IMPORTANT WORK IS MORE ACCURATE THAN ANY UNRESRAINED WORK"));
        words.add(new Word("ADHJAL GAGRI CHALKAT JAAYE","AN IGNORANT SHOUTS MORE BUT THE WISE REMAINS CALM"));
        words.add(new Word("BANDAR KYA JAANE ADRAK KA SWAAD","AN INCOMPETENT PERSON CANNOT UNDERSTAND THE IMMENSITY OF GREAT THINGS"));
        words.add(new Word("ULTA CHOR KOTWAAL KO DAATE","SHIFTING THE BLAME FROM THEMSELF TO THE BLAMERS"));
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

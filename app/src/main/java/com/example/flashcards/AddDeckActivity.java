package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.SharedPreferences;
import android.os.Bundle;

public class AddDeckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_deck_fragment_container);




        FragmentManager fm = getSupportFragmentManager();
        Fragment f = fm.findFragmentById(R.id.add_deck_fragment_container);
        if (f == null) {
            f = new AddDeckFragment();
            fm.beginTransaction().add(R.id.add_deck_fragment_container, f).commit();
        }
    }
}

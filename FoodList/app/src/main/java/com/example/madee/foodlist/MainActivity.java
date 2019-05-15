package com.example.madee.foodlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView ;
    String title[] = {"Italian Cheeasy Burger ","Mayoo with Hot Spicy", "Chicken Garlic Mayoo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

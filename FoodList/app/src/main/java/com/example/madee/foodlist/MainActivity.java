package com.example.madee.foodlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

   Button bur , bb, i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bbq);

        bur = (Button)findViewById(R.id.burger1);
        bb = (Button)findViewById(R.id.bbq);
        i = (Button)findViewById(R.id.italian2);
        bur.setEnabled(false);
        bb.setEnabled(false);
        i.setEnabled(false);
    }
}

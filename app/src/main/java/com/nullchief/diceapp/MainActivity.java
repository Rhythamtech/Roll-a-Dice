package com.nullchief.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView dice ;
    private Random RandomNo = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button RollBtn = findViewById(R.id.rollbtn);
        dice = findViewById(R.id.imageDice);
       RollBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              diceroll();
           }
       });

    }

    void diceroll()
    {
        int RandNo = RandomNo.nextInt(6) +1;
         switch (RandNo)
         {
             case 1:
                 dice.setImageResource(R.drawable.dice1);
             break;

             case 2:
                 dice.setImageResource(R.drawable.dice2);
                 break;
             case 3:
                 dice.setImageResource(R.drawable.dice3);
                 break;
             case 4:
                 dice.setImageResource(R.drawable.dice4);
                 break;
             case 5:
                 dice.setImageResource(R.drawable.dice5);
                 break;
             case 6:
                 dice.setImageResource(R.drawable.dice6);
                 break;

         }
    }
}
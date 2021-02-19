package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView TopDie = findViewById(R.id.user_die);
        final ImageView BottomDie = findViewById(R.id.com_die);
        Button higher = findViewById(R.id.higher_button);
        Button lower = findViewById(R.id.lower_button);
        TextView text = findViewById(R.id.Result);
        //-------------------------------------------------------------------

        final int [] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        higher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int randHighDie = rand.nextInt(6);
                int randLowDie = rand.nextInt(6);

                TopDie.setImageResource(diceArray[randHighDie]);
                BottomDie.setImageResource(diceArray[randLowDie]);

                if(randHighDie == randLowDie){
                    //it's tie
                    text.setText("IT'S A TIE");
                }else if(randHighDie> randLowDie){
                    //user win
                    text.setText("USER WIN!");
                }else {
                    //computer win
                    text.setText("COMPUTER WIN!");
                }
            }
        });

        lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int randHighDie = rand.nextInt(6);
                int randLowDie = rand.nextInt(6);

                TopDie.setImageResource(diceArray[randHighDie]);
                BottomDie.setImageResource(diceArray[randLowDie]);

                if(randHighDie == randLowDie){
                    //it's tie
                    text.setText("IT'S A TIE");
                }else if(randHighDie< randLowDie){
                    //user win
                    text.setText("USER WIN!");
                }else{
                    //computer win
                    text.setText("COMPUTER WIN!");
                }

            }
        });
    }
}
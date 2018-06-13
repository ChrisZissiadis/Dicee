package com.example.android.dicee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;
        rollbutton = findViewById(R.id.roll_button);
        final ImageView leftdice = findViewById(R.id.image_leftdice);
        final ImageView rightdice = findViewById(R.id.image_rightdice);

        final int[] diceArray = new int[]{
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                int number2 = randomNumberGenerator.nextInt(6);
                Log.d("Dicee", "The first random number is " +number);
                Log.d("Dicee", "The second random number is " +number2);

                leftdice.setImageResource(diceArray[number]);
                rightdice.setImageResource(diceArray[number2]);
            }
        });


    }
}

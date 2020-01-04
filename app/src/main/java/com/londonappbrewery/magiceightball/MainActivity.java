package com.londonappbrewery.magiceightball;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView img_ball = findViewById(R.id.img_ball);
        Button btn_tellAnswer = findViewById(R.id.btn_tellAnswer);

        final int [] balls = {
          R.drawable.ball1,
          R.drawable.ball2,
          R.drawable.ball3,
          R.drawable.ball4,
          R.drawable.ball5,
        };

        btn_tellAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rg = new Random();
                img_ball.setImageResource(balls[rg.nextInt(5)]);
            }
        });
    }
}

package com.radutopor.trivialapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private View greetMe;
    private TextView greeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetMe = findViewById(R.id.greet_me);
        greeting = (TextView) findViewById(R.id.greetings);

        greetMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long currentTime = System.currentTimeMillis();
                greeting.setText(GreetingGenerator.createGreeting(currentTime));

                greetMe.setVisibility(View.GONE);
                greeting.setVisibility(View.VISIBLE);
            }
        });
    }
}

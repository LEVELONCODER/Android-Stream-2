package com.leveloncoder.weather.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends AppCompatActivity {

    public Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Now I show this last application
        but it's on java
        create variable clickButton extends it
        for class Button in package(android.widget.Button)
        find this button by id using
        function findViewById();
        create on click event
         */

        clickButton = (Button) findViewById(R.id.clickButton);

        /* Long On Click Method(Without Lambda)
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
         */

        // Fast On Click Method(Lambda)
        clickButton.setOnClickListener(view -> {
            setContentView(R.layout.change_layout);
        });
    }
}
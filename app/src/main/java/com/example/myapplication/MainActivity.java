package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button newButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newButton = findViewById(R.id.newOne);
        newButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w) {
                openNewInfo();
            }
        });
    }
    public void openNewInfo () {
        Intent intent = new Intent(this,NewCounter.class);
        startActivity(intent);
    }
}
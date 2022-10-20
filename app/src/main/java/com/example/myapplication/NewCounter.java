package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.w3c.dom.Text;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.*;

import static android.content.Context.MODE_APPEND;

public class NewCounter extends AppCompatActivity {
    final SharedPreferences sharedPreferences = getSharedPreferences("USER",MODE_PRIVATE);
    ArrayList<Integer> numbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_counter);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void handleInput(View v) {
        EditText t = findViewById(R.id.editTextNumberDecimal);
        int input = Integer.parseInt((t.getText().toString()));
        numbers.add(input);
        Counter counter = new Counter(numbers);
        ((TextView)findViewById(R.id.infoView)).setText(counter.calcMost(input));
        //below is application to
        ((TextView)findViewById(R.id.arrayInputViewer)).setText(counter.numbersToShow());
        ((TextView)findViewById(R.id.scenarioShow)).setText(counter.findScenario(input,numbers));
    }


}
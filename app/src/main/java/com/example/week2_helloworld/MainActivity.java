package com.example.week2_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText meditText;
    TextView mtextView;
    Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meditText = findViewById(R.id.editTextTextPersonName);
        mtextView= findViewById(R.id.textView);
        mbutton = findViewById(R.id.button);



        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputValue = meditText.getText().toString();
                Toast.makeText(MainActivity.this, "Hi Again", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, inputValue, Toast.LENGTH_LONG).show();

                mtextView.setText("This is new text");
                mtextView.setText("Welcome to SIT305 " + inputValue);



            }
        });

    }
}
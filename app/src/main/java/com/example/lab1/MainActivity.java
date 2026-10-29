package com.example.lab1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView ftxt;
    EditText name_edit_1;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ftxt = (TextView) findViewById(R.id.textview1);
        name_edit1 = (EditText) findViewById(R.id.fname_edit);
        bt1 = (Button) findViewById(R.id.savebt);

        bt1.setOnClickListener(v -> {
            String name = name_edit1.getText().toString();
            ftxt.setText(name);
        });
    }
}
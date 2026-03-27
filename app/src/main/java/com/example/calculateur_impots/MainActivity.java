package com.example.calculateur_impots;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    Button button;
    EditText e1;
    EditText e2;
    TextView textView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        checkBox = findViewById(R.id.checkBox2);
        button = findViewById(R.id.button2);
        e1 = findViewById(R.id.edit_surface);
        e2 = findViewById(R.id.edit_nbr);
        textView3 = findViewById(R.id.textView3);
        button.setOnClickListener(v -> calculer());




    }

    private void calculer() {
        double surface = Double.parseDouble(e1.getText().toString());
        int nbr = Integer.parseInt(e1.getText().toString());
        boolean piscine = checkBox.isChecked();
        double impotBase = surface * 2;
        double supplement = nbr * 50 + (piscine ? 100 : 0);
        double total = impotBase + supplement;



        textView3.setText(String.format("Impôt total : %s DH", total));

    }
}
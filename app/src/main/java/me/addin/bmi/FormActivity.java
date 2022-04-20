package me.addin.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button btnHitung = (Button) findViewById(R.id.btn_hitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Make this dynamic
                double bb = 50; // kg
                double tb = 1.68; // m
                double bmi = bb/(Math.pow(tb, 2));

                Intent intent = new Intent(FormActivity.this, ResultActivity.class);
                intent.putExtra("bmi", bmi);
                startActivity(intent);
            }
        });
    }
}
package me.addin.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // TODO: Display correct illustration based on BMI value

        TextView tvNama = (TextView) findViewById(R.id.tv_nama);
        TextView tvBmi = (TextView) findViewById(R.id.tv_bmi);
        Button btnSelesai = (Button) findViewById(R.id.btn_selesai);

        double bmi = getIntent().getDoubleExtra("bmi", 0);
        String nama = getIntent().getStringExtra("nama");

        tvNama.setText(nama);
        tvBmi.setText(bmi + "");

        btnSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }
}
package me.addin.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvNama = (TextView) findViewById(R.id.tv_nama);
        Button btnLanjut = (Button) findViewById(R.id.btn_lanjut);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Make this dynamic
                String nama = "test";
                if (nama.equals("")) {
                    Toast.makeText(MainActivity.this, "Nama tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, FormActivity.class);
                    intent.putExtra("nama", nama);
                    startActivity(intent);
                }
            }
        });
    }


}
package com.fresh.fruitab;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class anggur_muscat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_anggur_muscat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Ambil TextView dari XML
        TextView textView11 = findViewById(R.id.textView11);

        // Buat teks dengan HTML
        String text = "<b>Rasa:</b> Manis dengan aroma muscat yang khas.<br>" +
                "<b>Warna:</b> Hijau kekuningan yang cerah.<br>" +
                "<b>Tekstur:</b> Renyah dan juicy.<br>" +
                "<b>Ukuran:</b> Buah berukuran besar dan tanpa biji.";

        // Atur teks ke TextView dengan Html formatting
        textView11.setText(Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY));


        ImageView imageView6 = findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(anggur_muscat.this, varian_anggur.class);
                startActivity(intent);
            }
        });


        ImageView imageView11 = findViewById(R.id.imageView11);
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(anggur_muscat.this, menu_utama.class);
                startActivity(intent);
            }
        });

        // Atur warna status bar menjadi hitam
        getWindow().setStatusBarColor(getResources().getColor(android.R.color.black));

        // Pastikan teks dan ikon status bar berwarna putih
        getWindow().getDecorView().setSystemUiVisibility(0); // 0 untuk ikon putih

    }
}
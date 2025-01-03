package com.fresh.fruitab;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textView4 = findViewById(R.id.textView4);
        textView4.setText(Html.fromHtml("<u>Daftar</u>"));


// Set OnClickListener untuk TextView
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Menavigasi ke halaman lupa_password
                Intent intent = new Intent(login_page.this, daftar_page.class);
                startActivity(intent);
            }
        });


    }
}
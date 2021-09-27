package com.example.thingstoseeinaichiprefecture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // CardView okazakiCard;
    CardView gamagoriCard;
    CardView inuyamaCard;
    CardView tokonameCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView okazakiCard = findViewById(R.id.card_view_okazaki);
        gamagoriCard = findViewById(R.id.card_view_gamagori);
        inuyamaCard = findViewById(R.id.card_view_inuyama);
        tokonameCard = findViewById(R.id.card_view_tokoname);

        okazakiCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent okazakiActivityIntent = new Intent(MainActivity.this, OkazakiActivity.class);
                startActivity(okazakiActivityIntent);
            }
        });

        gamagoriCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gamagoriActivityIntent = new Intent(MainActivity.this, GamagoriActivity.class);
                startActivity(gamagoriActivityIntent);
            }
        });

        inuyamaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inuyamaActivityIntent = new Intent(MainActivity.this, InuyamaActivity.class);
                startActivity(inuyamaActivityIntent);
            }
        });

        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:aichistuffs@aichi.com"));
                startActivity(launchEmailAppIntent);
            }
        });

        tokonameCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tokonameActivityIntent = new Intent(MainActivity.this, TokonameActivity.class);
                startActivity(tokonameActivityIntent);
            }
        });
    }
}
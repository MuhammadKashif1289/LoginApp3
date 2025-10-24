package com.example.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        CardView cardProfile = findViewById(R.id.cardProfile);
        CardView cardSettings = findViewById(R.id.cardSettings);
        CardView cardMessages = findViewById(R.id.cardMessages);
        CardView cardLogout = findViewById(R.id.cardLogout);

        cardProfile.setOnClickListener(v ->
                Toast.makeText(this, "Profile Clicked", Toast.LENGTH_SHORT).show()
        );

        cardSettings.setOnClickListener(v ->
                Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show()
        );

        cardMessages.setOnClickListener(v ->
                Toast.makeText(this, "Messages Clicked", Toast.LENGTH_SHORT).show()
        );

        cardLogout.setOnClickListener(v -> {
            Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show();
            finish(); // or navigate to login screen
        });
    }
}

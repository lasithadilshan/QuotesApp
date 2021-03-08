package com.dilshan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button share;
    TextView quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        share = findViewById(R.id.btnShare);
        quote = findViewById(R.id.tvQuote);

        getSupportActionBar().hide();

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String shareTxt = quote.getText().toString();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_TEXT,shareTxt);
                startActivity(sendIntent);

            }
        });

    }
}
package com.example.nativetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.nativetest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Button btn_urilink;
    private Button btn_applink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_urilink = findViewById(R.id.btn_urilink);
        btn_applink = findViewById(R.id.btn_applink);

        btn_urilink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlScheme = "market://details?id=youtube";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlScheme));
                startActivity(intent);
                finish();
            }
        });

        btn_applink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // String srchString = "test";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                startActivity(intent);
                finish();
            }
        });
    }

}
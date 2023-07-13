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
    private Button btn_deeplink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_deeplink = findViewById(R.id.btn_deeplink);


        // 회원가입 버튼을 클릭 시 수행
        btn_deeplink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, com.example.nativetest.RegisterActivity.class);
//                startActivity(intent);
                String url ="abc://def";
                Intent intent = new Intent(MainActivity.this, Uri.parse(url).getClass());
                startActivity(intent);
            }
        });
    }

    /**
     * A native method that is implemented by the 'nativetest' native library,
     * which is packaged with this application.
     */
}
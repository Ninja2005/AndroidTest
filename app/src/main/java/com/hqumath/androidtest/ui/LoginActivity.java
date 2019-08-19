package com.hqumath.androidtest.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.hqumath.androidtest.R;

/**
 * ****************************************************************
 * 文件名称: LoginActivity
 * 作    者: Created by gyd
 * 创建时间: 2019/8/15 15:29
 * 文件描述:
 * 注意事项:
 * 版权声明:
 * ****************************************************************
 */
public class LoginActivity extends AppCompatActivity {

    public Button btnLogin;
    public String state = "init";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        state = "onCreate";
    }

    @Override
    protected void onPause(){
        super.onPause();
        state = "onPause";
    }

    @Override
    protected void onStop(){
        super.onStop();
        state = "onStop";

    }
}

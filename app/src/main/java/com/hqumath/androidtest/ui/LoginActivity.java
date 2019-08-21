package com.hqumath.androidtest.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
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
    public Button btnCopy;
    public TextView userName;
    public TextView passwrod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = findViewById(R.id.user_name_et);
        passwrod = findViewById(R.id.password_et);

        btnCopy = findViewById(R.id.btn_copy);
        btnCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passwrod.setText(userName.getText());
            }
        });

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

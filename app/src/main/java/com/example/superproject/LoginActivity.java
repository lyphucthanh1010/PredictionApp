package com.example.superproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText etUserName;
    private EditText etPassWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUserName = findViewById(R.id.username);
        etPassWord = findViewById(R.id.password);
        Button btn = findViewById(R.id.login_bt);
        Button bt =  findViewById(R.id.login_bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserName = etUserName.getText().toString();
                String PassWord = etPassWord.getText().toString();

                if (UserName.equalsIgnoreCase("admin") && PassWord.equalsIgnoreCase("admin")) {
                    Intent intent = new Intent(LoginActivity.this, ServerDashBoardActivity.class);
                    startActivity(intent);
                }
                else if (UserName.isEmpty() || PassWord.isEmpty()) {
                    Toast.makeText(LoginActivity.this,
                                    "Missing Information", Toast.LENGTH_SHORT)
                            .show();

                }
                else {
                    startActivity(new Intent(LoginActivity.this, DashBoardActivity.class));
                }

            }
        });
        TextView tv2 = findViewById(R.id.dont);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            }
        });
    }
}
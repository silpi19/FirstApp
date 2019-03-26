package com.example.silpi.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "Login Activity";
    private TextView userpwd;
    private Button btPress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        String message = getIntent().getStringExtra("MESSAGE");
        userpwd = findViewById(R.id.em_id);
        btPress = findViewById(R.id.btPress);
        userpwd.setText("Welcome "+message);

          btPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG,"for login......>>>>");
                Intent intent = new Intent(LoginActivity.this,NewActivity.class);
                startActivity(intent);

            }
        });
    }

}

package com.example.silpi.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String reg[] = {"abc,123", "xyz,234", "mno,789", "ssa,889", "aaa,001"};
    private EditText edEmail;
    private EditText pwd;
    private Button button;
    private String email;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edEmail = findViewById(R.id.ed_email);

        pwd = findViewById(R.id.ed_pass);

        button = findViewById(R.id.b);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b:
                email = edEmail.getText().toString();
                password = pwd.getText().toString();

                for (int i = 0; i < 5; i++) {
                    String[] arr = reg[i].split(",");
                    if (email.equals(arr[0]) && password.equals(arr[1])) {
                        Intent myIntent = new Intent(MainActivity.this, LoginActivity.class);
                        myIntent.putExtra("MESSAGE", arr[0]);
                       startActivity(myIntent);
                       break;
                    } else {
                        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
                    }
                }



                break;
        }
    }


}

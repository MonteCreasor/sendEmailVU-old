package com.example.sendemailvu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendToEmailActivity(View view) {
        Intent intend = new Intent(this, SendEmailActivity.class);
        startActivity(intend);
    }
}

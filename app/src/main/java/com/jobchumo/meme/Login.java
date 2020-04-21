package com.jobchumo.meme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    protected EditText emaili, passwo;
    protected FirebaseAuth firebaseAuth;
    protected ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        emaili = (EditText) findViewById(R.id.emailaddress);
        passwo = (EditText) findViewById(R.id.passw);
        firebaseAuth = FirebaseAuth.getInstance();
        progressBar = new ProgressBar(this);
    }

    public void Log_in(View view) {
        String email = emaili.getText().toString().trim();
        String pas = passwo.getText().toString().trim();

        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(pas)) {
            Toast.makeText(Login.this, "Empty fields!! \nPlease Enter all your details", Toast.LENGTH_SHORT).show();
            return;
        }

    }

    public void Sign_up(View view) {
        //finish();
        startActivity(new Intent(Login.this, SignUp.class));
    }
}

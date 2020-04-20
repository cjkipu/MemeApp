package com.jobchumo.meme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);
    }

    public void Login(View view) {
        //finish();
        startActivity(new Intent(Home.this, Login.class));
    }

    public void Sign_up(View view) {
        //finish();
        startActivity(new Intent(Home.this, SignUp.class));
    }
}

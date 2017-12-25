package com.example.minhaj.loginlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;
import static com.example.minhaj.loginlab.R.id.passwordtxt;
import static com.example.minhaj.loginlab.R.id.usernametxt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usertext = (EditText) findViewById(R.id.usernametxt);
        EditText passtext = (EditText) findViewById(R.id.passwordtxt);

        Button btnlog = (Button) findViewById(R.id.buttonlogin);

        String UserName = usertext.getText().toString();
        String Password = passtext.getText().toString();


    }



}

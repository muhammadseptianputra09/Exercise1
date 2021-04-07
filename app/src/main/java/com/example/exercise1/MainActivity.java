package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnlogin;
    EditText edEmail, edPwd;
    String Email, password;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin = findViewById(R.id.btnlgn);
        edEmail = findViewById(R.id.inputEmail);
        edPwd = findViewById(R.id.inputPassword);
        signup = findViewById(R.id.signup);

        setError();

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Email = edEmail.getText().toString();
                password = edPwd.getText().toString();

                if (Email.equals("unang") && password.equals("123"))
                {
                   Toast.makeText(MainActivity.this, "Login Berhasil",Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(getApplicationContext(),Listview.class);
                    startActivity(i);
                }

                else if (!Email.equals("unang") && password.equals("09092000"))
                {
                    edEmail.requestFocus();
                    edEmail.setError("Username salah");
                }
                else if (Email.equals("unang") && !password.equals("09092000")) {
                    edPwd.requestFocus();
                    edPwd.setError("Password salah");
                }

                else {
                        if(Email.isEmpty()){
                            edEmail.setError("Username salah");
                        }
                        if(password.isEmpty()){
                            edPwd.setError("Password salah");
                    }
                }

            }

        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),pendaftaran.class);
                startActivity(i);
            }
        });
    }


    void setError(){
        edEmail = findViewById(R.id.inputEmail);
        edPwd = findViewById(R.id.inputPassword);

        edEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                edEmail.setError(null);
            }
        });

        edPwd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                edPwd.setError(null);
            }
        });
    }

}

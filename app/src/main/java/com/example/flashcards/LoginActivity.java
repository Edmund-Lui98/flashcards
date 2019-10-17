package com.example.flashcards;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText username;
    EditText password;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*
        mAuth = FirebaseAuth.getInstance();
        username = findViewById(R.id.usernameInput);
        password = findViewById(R.id.passwordInput);
        btnLogin    = findViewById(R.id.loginBtn);

         */

    }
    /*
    public void onClickLogin(View view){
        if(username.length()>0 && password.length()>0){
            mAuth.signInWithEmailAndPassword(username.getText().toString(), password.getText().toString()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        logIn();
                    }
                    else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Invalid Email or Password. Please try again.", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            });
        } else {
            Toast toast_2 = Toast.makeText(getApplicationContext(), "Please Fill up the username and password fields before.",Toast.LENGTH_SHORT);
            toast_2.show();
        }
    }

     */
    public void logIn(View view) {
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }

}
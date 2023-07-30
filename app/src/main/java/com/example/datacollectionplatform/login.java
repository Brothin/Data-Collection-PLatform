package com.example.datacollectionplatform;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    private EditText loginEmail, loginPassword, loginPhone;
    private TextView signupRedirectText;
    private Button loginButton;
    private FirebaseAuth auth;
    TextView forgotPassword;
    GoogleSignInOptions gOptions;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            Intent intent=getIntent();
            String phn=intent.getStringExtra("phone");
            loginEmail = findViewById(R.id.login_email);
            loginPassword = findViewById(R.id.login_password);
            loginPhone = findViewById(R.id.login_phone);
            loginButton = findViewById(R.id.login_button);
            signupRedirectText = findViewById(R.id.signUpRedirectText);
            forgotPassword = findViewById(R.id.forgot_password);
            auth = FirebaseAuth.getInstance();
            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String email = loginEmail.getText().toString();
                    String pass = loginPassword.getText().toString();
                    String phn = loginPhone.getText().toString();
                    if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                        if (!pass.isEmpty()) {
                            if (!phn.isEmpty()) {
                                auth.signInWithEmailAndPassword(email, pass)
                                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                                            @Override
                                            public void onSuccess(AuthResult authResult) {
                                                Toast.makeText(login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                                                Intent intent=new Intent(getApplicationContext(), list_of_activities.class);
                                                intent.putExtra("phone",phn);
                                                startActivity(intent);
                                                finish();
                                            }
                                        }).addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                Toast.makeText(login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                                            }
                                        });
                            }
                            else{
                                loginPhone.setError("Empty fields are not allowed");
                            }
                        } else{
                            loginPassword.setError("Empty fields are not allowed");
                        }
                    } else if (email.isEmpty()) {
                        loginEmail.setError("Empty fields are not allowed");
                    } else {
                        loginEmail.setError("Please enter correct email");
                    }
                }
            });
            signupRedirectText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getApplicationContext(), list_of_activities.class);
                    intent.putExtra("phone",phn);
                    startActivity(intent);
                }
            });
    }
}
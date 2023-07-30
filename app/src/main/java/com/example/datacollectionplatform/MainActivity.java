package com.example.datacollectionplatform;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.datacollectionplatform.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText signupEmail, signupPassword, signupPhone;
    private Button signupButton;
    private TextView loginRedirectText;
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d("Test","Test Log");
            String TAG = "first Log";
            Log.d(TAG,"Log Message");
            auth = FirebaseAuth.getInstance();
            signupEmail = findViewById(R.id.signup_email);
            signupPassword = findViewById(R.id.signup_password);
            signupPhone = findViewById(R.id.signup_phone);
            signupButton = findViewById(R.id.signup_button);
            loginRedirectText = findViewById(R.id.loginRedirectText);
            signupButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String user = signupEmail.getText().toString().trim();
                    String pass = signupPassword.getText().toString().trim();
                    String phn = signupPhone.getText().toString().trim();
                    if (user.isEmpty()){
                        signupEmail.setError("Email cannot be empty");
                    }
                    if (phn.isEmpty()){
                        signupPhone.setError("Phone number cannot be empty");
                    }
                    if (pass.isEmpty()){
                        signupPassword.setError("Password cannot be empty");
                    } else{
                        auth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(MainActivity.this, "SignUp Successful", Toast.LENGTH_SHORT).show();
                                    Intent intent=new Intent(getApplicationContext(), login.class);
                                    intent.putExtra("phone",phn);
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(MainActivity.this, "SignUp Failed" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }
            });
            loginRedirectText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(getApplicationContext(), login.class);
                    startActivity(intent);
                }
            });
        }
}
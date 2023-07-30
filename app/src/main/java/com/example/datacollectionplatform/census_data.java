package com.example.datacollectionplatform;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class census_data extends AppCompatActivity {
    Intent intent;
    String phn;
    EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7,edit8,edit9,edit10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_census_data);
        Button submit=findViewById(R.id.submit);
        intent=getIntent();
        phn=intent.getStringExtra("phone");

        edit1=findViewById(R.id.edit1);
        edit2=findViewById(R.id.edit2);
        edit3=findViewById(R.id.edit3);
        edit4=findViewById(R.id.edit4);
        edit5=findViewById(R.id.edit5);
        edit6=findViewById(R.id.edit6);
        edit7=findViewById(R.id.edit7);
        edit8=findViewById(R.id.edit8);
        edit9=findViewById(R.id.edit9);
        edit10=findViewById(R.id.edit10);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addData();
                Intent intent=new Intent(getApplicationContext(), notification.class);
                intent.putExtra("phone",phn);
                startActivity(intent);
            }
        });
    }

    private void addData() {
        String nationality=edit1.getText().toString();
        String name=edit2.getText().toString();
        String age=edit3.getText().toString();
        String religion=edit4.getText().toString();
        String caste=edit5.getText().toString();
        String occupation=edit6.getText().toString();
        String sex=edit7.getText().toString();
        String disability=edit8.getText().toString();
        String motherTongue=edit9.getText().toString();
        String maritalStatus=edit10.getText().toString();

        StringRequest stringRequest=new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbx3jMpa_0qwHieVTajcOvgcuK6oxRQ4sVMHOkj9zPbm7ogIeFOBjl6zB3msnLDKkks/exec", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Intent intent=new Intent(getApplicationContext(), notification.class);
                intent.putExtra("phone",phn);
                startActivity(intent);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){
            @Nullable
            @Override
            protected Map<String, String> getParams() {
                Map<String,String> params=new HashMap<>();
                params.put("action","addData");
                params.put("vnationality",nationality);
                params.put("vname",name);
                params.put("vage",age);
                params.put("vreligion",religion);
                params.put("vcaste",caste);
                params.put("voccupation",occupation);
                params.put("vsex",sex);
                params.put("vdisability",disability);
                params.put("vmotherTongue",motherTongue);
                params.put("vmaritalStatus",maritalStatus);

                return params;
            }
        };

        int socketTimeOut=50000;
        RetryPolicy retryPolicy=new DefaultRetryPolicy(socketTimeOut,0,DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
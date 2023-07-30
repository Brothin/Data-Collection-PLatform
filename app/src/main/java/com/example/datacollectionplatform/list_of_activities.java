package com.example.datacollectionplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class list_of_activities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_activities);
        Intent intent=getIntent();
        String phn=intent.getStringExtra("phone");
        TextView census=findViewById(R.id.census);
        TextView inventory=findViewById(R.id.inventory);
        TextView cus_details=findViewById(R.id.cus_details);
        census.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), census_data.class);
                intent.putExtra("phone",phn);
                startActivity(intent);
            }
        });
    }
}
package com.example.aleksin.Navigaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.aleksin.R;
import com.example.aleksin.Schools.CollegeActivity;
import com.example.aleksin.Schools.SchoolaActivity;

public class SchoolActivity extends AppCompatActivity {


    private Button school_btn, college_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uchrezhd_activity);
        addOnListViewSchool();

        school_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SchoolActivity.this, SchoolaActivity.class);
                startActivity(i);
            }
        });

        college_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SchoolActivity.this, CollegeActivity.class);
                startActivity(i);
            }
        });

    }

    private void addOnListViewSchool()
    {
        school_btn = (Button) findViewById(R.id.school_btn);
        college_btn = (Button) findViewById(R.id.college_btn);
    }
}
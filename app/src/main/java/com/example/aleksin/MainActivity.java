package com.example.aleksin;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.aleksin.Navigaton.AleksinActivity;
import com.example.aleksin.Navigaton.DostopriActitvity;
import com.example.aleksin.Navigaton.SchoolActivity;
import com.example.aleksin.Navigaton.ShopActivity;
import com.example.aleksin.settings.SettingsActivity;

public class MainActivity extends AppCompatActivity {

    private Adapter adapter;
    private Button button_aleks, button_dostopri, button_shop, button_school;
    private DrawerLayout drawer;
    private ListView list;
    private String[] array;
    private Toolbar toolbar;
    private int category_index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        button_aleks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AleksinActivity.class);
                startActivity(i);
            }
        });

        button_dostopri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, DostopriActitvity.class);
                startActivity(i);
            }
        });

        button_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ShopActivity.class);
                startActivity(i);
            }
        });

        button_school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SchoolActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            Intent i = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    public void addListenerOnButton() {
        list = findViewById(R.id.listView);
        button_aleks = findViewById(R.id.button_aleks);
        button_dostopri = findViewById(R.id.button_dostopri);
        button_shop = findViewById(R.id.button_shop);
        button_school = findViewById(R.id.button_school);
    }

}

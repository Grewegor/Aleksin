package com.example.aleksin.Navigaton;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aleksin.R;
import com.example.aleksin.RecyclerView.Club;
import com.example.aleksin.RecyclerView.ClubAdapter;
import com.example.aleksin.Text_Content_Activitys.Text_Content_Activity;

import java.util.ArrayList;
import java.util.List;


public class AleksinActivity extends AppCompatActivity implements ClubAdapter.OnClickShowListener {

    private RecyclerView list;
    private List<Club> clubList;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        initListAleksin();

        list = findViewById(R.id.listView);
        ClubAdapter clubAdapter = new ClubAdapter(this, clubList, this);

        list.setAdapter(clubAdapter);
        list.setLayoutManager(new LinearLayoutManager(this));


    }

    private void initListAleksin() {
        clubList = new ArrayList<>();
        clubList.add(new Club("Происхождение города Алексин", getString(R.string.aleks_1), R.drawable.aleks_1));
        clubList.add(new Club("История строительства Соцгорода", getString(R.string.aleks_2), R.drawable.aleks_2));
    }

    
    @Override
    public void onClickShowListener(int position) {
        String name = clubList.get(position).getName();
        String description = clubList.get(position).getDescription();
        int logo = clubList.get(position).getLogo();

        Intent intent = new Intent(this, Text_Content_Activity.class);
        intent.putExtra("name", name);
        intent.putExtra("description", description);
        intent.putExtra("logo", logo);
        intent.putExtra("category", 0);
        startActivity(intent);
    }
}
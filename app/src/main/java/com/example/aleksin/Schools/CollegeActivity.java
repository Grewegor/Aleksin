package com.example.aleksin.Schools;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aleksin.R;
import com.example.aleksin.RecyclerView.Club;
import com.example.aleksin.RecyclerView.ClubAdapter;
import com.example.aleksin.Text_Content_Activitys.Text_Content_Activity_School;

import java.util.ArrayList;
import java.util.List;

public class CollegeActivity extends AppCompatActivity implements ClubAdapter.OnClickShowListener {
    private RecyclerView list;
    private List<Club> clubList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        initListCollege();

        list = findViewById(R.id.listView);
        ClubAdapter clubAdapter = new ClubAdapter(this, clubList, this);

        list.setAdapter(clubAdapter);
        list.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initListCollege() {
        clubList = new ArrayList<>();
        clubList.add(new Club("Алексинский машиностроительный техникум", getString(R.string.college_1), R.drawable.college_1));
        clubList.add(new Club("Алексинский гидрометеорологический техникум", getString(R.string.college_2), R.drawable.college_2));
        clubList.add(new Club("Алексинский химико технологический техникум", getString(R.string.college_3), R.drawable.college_3));
    }


    @Override
    public void onClickShowListener(int position) {
        String name = clubList.get(position).getName();
        String description = clubList.get(position).getDescription();
        int logo = clubList.get(position).getLogo();

        Intent intent = new Intent(this, Text_Content_Activity_School.class);
        intent.putExtra("name", name);
        intent.putExtra("description", description);
        intent.putExtra("logo", logo);
        intent.putExtra("category", 0);
        startActivity(intent);
    }

}

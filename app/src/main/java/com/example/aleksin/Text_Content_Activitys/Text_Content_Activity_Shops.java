package com.example.aleksin.Text_Content_Activitys;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aleksin.R;

public class Text_Content_Activity_Shops extends AppCompatActivity {

    private TextView text_content;
    private Typeface face1;

    private boolean isImageScaled = false;
    private ImageView iContent;

    private SharedPreferences def_pref;
    private int category;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content_activity);
        init();
        reciveIntent();
        iContent.setOnClickListener(v -> {
            if (!isImageScaled) v.animate().scaleX(1.4f).scaleY(1.4f).setDuration(500);
            if (isImageScaled) v.animate().scaleX(1f).scaleY(1f).setDuration(500);
            isImageScaled = !isImageScaled;
        });
    }

    public void reciveIntent()
    {
        Intent i = getIntent();
        if (i != null)
        {
            category = i.getIntExtra("category",0);

        }
        switch (category)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:{
                String description = getIntent().getStringExtra("description");
                int logo = getIntent().getIntExtra("logo", R.mipmap.ic_aleksin);

                text_content.setText(description);
                iContent.setImageResource(logo);
            }
                break;
        }
    }
    private void init()
    {
        def_pref = PreferenceManager.getDefaultSharedPreferences(this);
        text_content = findViewById(R.id.text_main_content);
        iContent = findViewById(R.id.imageContent);
        face1 = Typeface.createFromAsset(this.getAssets(),"fonts/Merriweather-BlackItalic.ttf");
        text_content.setTypeface(face1);
        String text = def_pref.getString("main_text_size", "Средний");
        if (text != null) {
            switch (text)
            {
                case "Большой" :
                    text_content.setTextSize(19);
                    break;
                case "Средний" :
                    text_content.setTextSize(13);
                    break;
                case "Маленький" :
                    text_content.setTextSize(10);
                    break;
            }
        }
    }

}

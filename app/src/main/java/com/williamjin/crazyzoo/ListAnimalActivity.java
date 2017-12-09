package com.williamjin.crazyzoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ListAnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_animal);

        TextView tv = findViewById(R.id.tv_test);
        String type = getIntent().getStringExtra("type");
        tv.setText(type);
    }
}

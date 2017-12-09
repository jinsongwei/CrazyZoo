package com.williamjin.crazyzoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.williamjin.crazyzoo.model.Catergory;
import com.williamjin.crazyzoo.model.DataSources;

import java.util.List;

public class ListCategoryActivity extends AppCompatActivity {


    private List<Catergory> catergories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_category);

        DatabaseHelper db = new DatabaseHelper(this);
        catergories = db.queryCategoriesALl();

        CategoryListAdapter categoryListAdapter = new CategoryListAdapter(this, R.layout.category_list_item, catergories);
        ListView lvCategory = findViewById(R.id.lv_category);
        lvCategory.setAdapter(categoryListAdapter);

        lvCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String type = catergories.get(i).getType();
                Intent intent = new Intent(ListCategoryActivity.this, ListAnimalActivity.class);
                intent.putExtra("type", type);
                startActivity(intent);
            }
        });
    }
}

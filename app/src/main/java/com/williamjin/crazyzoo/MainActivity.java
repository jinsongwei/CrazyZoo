package com.williamjin.crazyzoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.williamjin.crazyzoo.model.Animal;
import com.williamjin.crazyzoo.model.Catergory;
import com.williamjin.crazyzoo.model.DataSources;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void handleHomeButton(View view) {
        Intent intent = new Intent(this, ListCategoryActivity.class);
        startActivity(intent);
    }

    private void queryData(){
        DatabaseHelper db = new DatabaseHelper(this);
        List<Catergory> catergories = db.queryCategoriesALl();
        Log.e(TAG, "queryData: "+ "" + catergories.size());
        for(Catergory c : catergories){
            Log.d(TAG, "queryData: " + c.toString());
        }

        List<Animal> animals = db.queryAnimalsAll();
        Log.e(TAG, "queryData: "+ "" + animals.size());
        for(Animal a : animals){
            Log.d(TAG, "queryData: " + a.toString());
        }
    }
    private void insertData(){
        DatabaseHelper db = new DatabaseHelper(this);
        db.insertCategories(DataSources.generateCategories());
        db.insertAnimals(DataSources.generateAnimals());
    }

    private void test(){
        DatabaseHelper db = new DatabaseHelper(this);
    }

}

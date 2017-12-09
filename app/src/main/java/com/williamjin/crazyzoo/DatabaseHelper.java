package com.williamjin.crazyzoo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.williamjin.crazyzoo.model.Animal;
import com.williamjin.crazyzoo.model.Catergory;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;
import static com.williamjin.crazyzoo.model.DatabaseMeta.*;

/**
 * Created by william on 12/6/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, ZOO_DATABASE, null, VERSION);
        Log.e(TAG, "onCreate: \n" + ZooCategory.CREATE_TABLE_COMMAND);
        Log.e(TAG, "onCreate: \n" + ZooAnimal.CREATE_TABLE_COMMAND);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(ZooCategory.CREATE_TABLE_COMMAND);
        sqLiteDatabase.execSQL(ZooAnimal.CREATE_TABLE_COMMAND);
        Log.e(TAG, "onCreate: \n" + ZooCategory.CREATE_TABLE_COMMAND);
        Log.e(TAG, "onCreate: \n" + ZooAnimal.CREATE_TABLE_COMMAND);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insertCategories(List<Catergory> catergories) {
        SQLiteDatabase db = this.getWritableDatabase();
        for (Catergory c : catergories) {
            db.execSQL(c.insertCommand());
        }
    }

    public void insertAnimals(List<Animal> animals) {
        SQLiteDatabase db = this.getWritableDatabase();
        for (Catergory a : animals) {
            db.execSQL(a.insertCommand());
        }
    }

    public List<Catergory> queryCategoriesALl() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM category", null);
        List<Catergory> categories = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                categories.add(new Catergory(
                        cursor.getString(0),
                        cursor.getString(1)
                ));
            } while (cursor.moveToNext());
        }
        return categories;
    }

    public List<Animal> queryAnimalsAll() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM animal", null);
        List<Animal> animals = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                animals.add(new Animal(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getInt(3),
                        cursor.getString(4),
                        cursor.getString(5),
                        cursor.getString(6)
                ));
            } while (cursor.moveToNext());
        }
        return animals;
    }
}

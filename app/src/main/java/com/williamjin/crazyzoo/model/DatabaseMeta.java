package com.williamjin.crazyzoo.model;

import android.provider.BaseColumns;

/**
 * Created by william on 12/6/17.
 */

public class DatabaseMeta {

    public static final String ZOO_DATABASE = "crazy_zoo";
    public static final Integer VERSION = 1;

    public static class ZooCategory implements BaseColumns {
        public static final String TABLE_NAME = "category";

        public static final String TYPE = "type";
        public static final String BODY_TYPE = "body_type";

        public static final String CREATE_TABLE_COMMAND =
                "CREATE TABLE " + TABLE_NAME + "(\n" +
                        TYPE + " VARCHAR(255)" + ",\n" +
                        BODY_TYPE + " VARCHAR(8));";
    }

    public static class ZooAnimal implements BaseColumns {

        public static final String TABLE_NAME = "animal";

        public static final String NAME = "name";
        public static final String TYPE = "type";
        public static final String WEIGHT = "weight";
        public static final String SOUND = "sound";
        public static final String DETAIL = "detail";
        public static final String REFERENCE = "reference";

        public static final String CREATE_TABLE_COMMAND =
                "CREATE TABLE " + TABLE_NAME + "(\n" +
                        _ID + " INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                        NAME + " VARCHAR(255),\n" +
                        TYPE + " VARCHAR(255),\n" +
                        WEIGHT + " INTEGER,\n" +
                        SOUND +  " VARCHAR(255),\n" +
                        DETAIL + " VARCHAR(255),\n" +
                        REFERENCE + " TEXT);";
    }
}

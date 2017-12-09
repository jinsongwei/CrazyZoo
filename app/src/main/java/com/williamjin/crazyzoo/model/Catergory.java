package com.williamjin.crazyzoo.model;

import static com.williamjin.crazyzoo.model.DatabaseMeta.*;

/**
 * Created by william on 12/6/17.
 */

public class Catergory {
    protected String type;
    private String bodyType;

    private static final String notAvialable = "N/A";

    public Catergory(String type) {
        this.type = type;
        this.bodyType = notAvialable;
    }

    public Catergory(String type, String bodyType) {
        this.type = type;
        this.bodyType = bodyType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBodyType() {
        return bodyType;
    }


    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Catergory{" +
                "type='" + type + '\'' +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }

    public String insertCommand(){
        return "INSERT INTO " + ZooCategory.TABLE_NAME + "(\n"
                + ZooCategory.TYPE + ",\n"
                + ZooCategory.BODY_TYPE + "\n)"
                + "VALUES (\n"
                + "'" + type + "',\n"
                + "'" + bodyType + "'\n)";
    }
}

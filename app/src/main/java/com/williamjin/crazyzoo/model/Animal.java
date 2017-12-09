package com.williamjin.crazyzoo.model;

import android.telecom.Call;

import static com.williamjin.crazyzoo.model.DatabaseMeta.*;

/**
 * Created by william on 12/6/17.
 */

public class Animal extends Catergory {
    private Integer id;
    private String name;
    private Integer weight;
    private String sound;
    private String detail;
    private String reference;

    public Animal(String type) {
        super(type);
    }

    public Animal(Integer id, String name, String type, Integer weight, String sound, String detail, String reference) {
        super(type);
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.detail = detail;
        this.sound = sound;
        this.reference = reference;
    }

    public Animal(String name, String type, Integer weight, String sound, String detail, String reference) {
        super(type);
        id = -1;
        this.name = name;
        this.weight = weight;
        this.detail = detail;
        this.sound = sound;
        this.reference = reference;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                "type=" + type +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", sound='" + sound + '\'' +
                ", detail='" + detail + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }

    @Override
    public String insertCommand() {
        return "INSERT INTO " + ZooAnimal.TABLE_NAME + "(\n"
                + ZooAnimal.NAME + ",\n"
                + ZooAnimal.TYPE + ",\n"
                + ZooAnimal.WEIGHT + ",\n"
                + ZooAnimal.SOUND + ",\n"
                + ZooAnimal.DETAIL + ",\n"
                + ZooAnimal.REFERENCE + ")\n"
                + "VALUES(\n"
                + "'" + name + "',"
                + "'" + type + "',"
                + "'" + weight + "',"
                + "'" + sound + "',"
                + "'" + detail + "',"
                + "'" + reference + "')";
    }
}

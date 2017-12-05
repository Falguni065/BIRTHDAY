package com.example.sharna.birthday;

/**
 * Created by Sharna on 12/2/2017.
 */


public class Temp {

    private int id;
    private String name;
    private String day;


    public Temp(String n, String d ){
        name = n;
        day = d;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
package com.example.mihkel.starbucksapp;

public class Drinks {

    private String name;
    private String desc;
    private int imageID;


    public static final Drinks[] drinks={
            new Drinks("Latte", "this is  a description  for latte",R.drawable.latte),
            new Drinks("Cappuccino", "this is  a description  for latte",R.drawable.cappuccino),
            new Drinks("Filter", "this is  a description  for latte",R.drawable.filter),




    };
    private  Drinks(String name,String des, int imageID ){

        this.name=name;
        this.desc=desc;
        this.imageID=imageID;



    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }

    @Override
    public String toString() {
        return this.name;
    }
}



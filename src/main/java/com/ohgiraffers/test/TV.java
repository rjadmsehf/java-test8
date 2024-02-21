package com.ohgiraffers.test;

public class TV {

    private String brand;
    private int year;
    private int inch;



    public TV (String brand , int year , int inch){
        this.brand = brand;
        this.year = year;
        this.inch = inch;
    }
    public void show(){
        System.out.println(brand + "에서 만든" + year + "년"+ inch +"인치");
    }

    //LG에서 만든 2017년 32인치
}

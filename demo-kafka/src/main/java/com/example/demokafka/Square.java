package com.example.demokafka;

public class Square extends Shape {
    public Square(){
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

    public void show(){
        System.out.println("这是一个Square");
    }
    public void show1(){
        System.out.println("这是一个Square");
    }
}

package com.example.demokafka;

public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
    public void show(){
        System.out.println("----这是一个Circle");
    }

    public void show1(){
        System.out.println("----这是一个Circle");
    }
}

package org.example.creational.factory;

public class Main {
    public static void main(String[] args) {
        Factory shapeFactory=new Factory();
        Fac shape1= shapeFactory.getShape("CR");
        shape1.factes();

        Fac shape2= shapeFactory.getShape("TR");
        shape2.factes();


    }
}

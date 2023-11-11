package org.example.structral.decorator;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        ShapesInterface shapesInterface=new RedColor(new Circle());


        Trangle trangle=new Trangle();
        ShapesInterface shapesInterface1=new RedColor(new Trangle());


        //with out decorator red color
        circle.draw();


        //with red color decoraotr
shapesInterface1.draw();
shapesInterface.draw();
   }
}

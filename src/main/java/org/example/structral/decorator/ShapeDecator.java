package org.example.structral.decorator;

public class ShapeDecator implements ShapesInterface{
    protected ShapesInterface decorator;



    ShapeDecator (ShapesInterface decorator){
        this.decorator=decorator;
    }



    @Override
    public void draw() {
        decorator.draw();
    }


}

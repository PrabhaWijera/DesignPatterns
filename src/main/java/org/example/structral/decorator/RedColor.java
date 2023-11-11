package org.example.structral.decorator;

public class RedColor extends ShapeDecator {

    RedColor(ShapesInterface decorator) {
        super(decorator);
    }


    @Override
    public void draw() {
        decorator.draw();
        setRedPalate(decorator);
    }
    private void setRedPalate(ShapesInterface redPalate){

        System.out.println("RED 🔖🔖🔖");
    }

}

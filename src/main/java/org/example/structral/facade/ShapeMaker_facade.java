package org.example.structral.facade;

public class ShapeMaker_facade {

    private FacadeInterface circle;

    private FacadeInterface trangle;


    public ShapeMaker_facade() {
        circle = new Circle();
        trangle = new Trangle();
    }



    public void CallbackCircle(){
        circle.shapes();
    }
    public void CallbackTrangle(){
        trangle.shapes();
    }


}

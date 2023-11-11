package org.example.structral;

public class ShapeMaker_facade {

    private FacadeInterface circle;

    private FacadeInterface trangle;


    public ShapeMaker_facade(FacadeInterface circle, FacadeInterface trangle) {
        this.circle = circle;
        this.trangle = trangle;
    }

    public void CallbackCircle(){
        circle.shapes();
    }
    public void CallbackTrangle(){
        trangle.shapes();
    }

}

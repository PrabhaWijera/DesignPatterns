package org.example.behavior.Observer_designpttern.observer;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }



    @Override
    public void update() {
        System.out.println("Binary value"+Integer.toBinaryString(subject.getValue()));
    }
}

package org.example.behavior.Observer_designpttern.observer;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }


    @Override
    public void update() {
        System.out.println("Hexa value"+Integer.toHexString(subject.getValue()));
    }
}

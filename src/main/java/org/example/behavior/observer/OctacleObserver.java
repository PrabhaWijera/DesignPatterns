package org.example.behavior.observer;

public class OctacleObserver extends Observer{

    public OctacleObserver(Subject subject){
        this.subject=subject;
        subject.attach(this);
    }


    @Override
    public void update() {
        System.out.println("Octale value"+Integer.toOctalString(subject.getValue()));
    }
}

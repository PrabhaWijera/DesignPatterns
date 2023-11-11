package org.example.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> obseversLsit=new ArrayList<>();

    private int value;

    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value=value;
    }

    public void attach(Observer observers){
        obseversLsit.add(observers);
    }
    public void notifyToAllObservers(){
        for (Observer observer:obseversLsit){
            observer.update();
        }
    }
}

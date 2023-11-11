package org.example.behavior;

import org.example.behavior.Observer_designpttern.observer.BinaryObserver;
import org.example.behavior.Observer_designpttern.observer.HexaObserver;
import org.example.behavior.Observer_designpttern.observer.OctacleObserver;
import org.example.behavior.Observer_designpttern.observer.Subject;

public class Main {

    public static void main(String[] args) {
        Subject subject=new Subject();

        new BinaryObserver(subject);
        new OctacleObserver(subject);
        new HexaObserver(subject);

        System.out.println("set value");
        subject.setValue(2);

        System.out.println("second vlaue ");
        subject.setValue(24);




    }
}

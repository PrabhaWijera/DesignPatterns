package org.example.creational.singleton;

public class Singleton {

    private static Singleton singleton;
    private Connection connection;

    private Singleton(){
     connection=new Connection();
    }

    public static Singleton getInstance(){
     return singleton==null? new Singleton():singleton;
    }

    public Connection getConnection(){
        return connection;
    }
}

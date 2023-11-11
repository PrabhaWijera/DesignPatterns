package org.example.behavior.strategy;

public class AddOperation implements Strategy{
    @Override
    public int doOperation(int a, int v) {
        return a+v;
    }
}

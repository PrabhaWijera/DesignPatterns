package org.example.behavior.strategy;

public class MultiplaeOperation implements Strategy{
    @Override
    public int doOperation(int a, int v) {
        return a*v;
    }
}

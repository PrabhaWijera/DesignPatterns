package org.example.behavior.strategy;

public class Main {

    public static void main(String[] args) {
        Context context=new Context(new AddOperation());
        System.out.println("Add operation [4,3]"+context.executeOperations(4,3));

        Context context1=new Context(new SubstractOperation());
        System.out.println("substract operation [4,3]"+context1.executeOperations(4,3));

        Context context2=new Context(new MultiplaeOperation());
        System.out.println("multiply operation [4,3]"+context2.executeOperations(4,3));
    }
}

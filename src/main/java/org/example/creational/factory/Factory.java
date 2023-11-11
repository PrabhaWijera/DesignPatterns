package org.example.creational.factory;

public class Factory {
    public Fac getShape(String shapeType){
        if (shapeType==null){
          return  null;
        }else {
         if (shapeType.equalsIgnoreCase("CR")){
             return new Circles();
         }else if (shapeType.equalsIgnoreCase("TR")){
             return new Trangle();
         }
        }
        return null;
    }

}

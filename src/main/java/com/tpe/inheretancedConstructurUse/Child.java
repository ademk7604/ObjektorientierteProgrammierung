package com.tpe.inheretancedConstructurUse;

public class Child extends BParent{

    String name="Child not named";
    Child(){
        System.out.println("Child constructur worked");
    }

    public static void main(String[] args) {
        AGrandParent aGrandParent = new AGrandParent();

        Child child = new Child();
        child.grandparentClubName="Child1";
        child.parentClubName="Child2";

    }
}

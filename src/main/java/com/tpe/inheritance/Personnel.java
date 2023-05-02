package com.tpe.inheritance;


public class Personnel {

    protected  int persNo;
    protected String persName;
    protected String department;

    protected  void salary(){
        System.out.println("All staff has a salary");

    }
    protected  void overtime(){
        System.out.println("All personnel work overtime according to their status");
    }
    protected void overtimeSalary(){
        System.out.println("Personnel receive overtime pay according to their status");
    }
}

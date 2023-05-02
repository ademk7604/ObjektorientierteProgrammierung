package com.tpe.inheritance;

public class Worker extends Personnel {

    int persNo=1001;

    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println(worker.persName);

        worker.persName="Jonas";
        System.out.println(worker.persNo);

        worker.salary();

    }
    public  void overtime(){
        System.out.println("Workers receive a minimum hourly wage of 15 euro");
    }
    public void privateInsurance(){
        System.out.println("Workers can get a 50 per cent discount if they want");
    }
}

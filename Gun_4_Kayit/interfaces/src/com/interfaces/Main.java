package com.interfaces;

public class Main {

    public static void main(String[] args) {


        Logger[] loggers={new SmsLogger(),new EmailLogger(),new FileLogger()};

        CostumerManager manager = new CostumerManager(loggers);


        Costumer costumer = new Costumer(1,"Monica","Ucak");
        Costumer costumer1 = new Costumer(1,"Deniz","Ucak");
        Costumer costumer2 = new Costumer(1,"Cengiz","Ucak");

       // manager.add(costumer);


        Costumer[] costumers={costumer,costumer1,costumer2};

        manager.add(costumer);
        System.out.println("**********");
        manager.add(costumer2);



    }
}

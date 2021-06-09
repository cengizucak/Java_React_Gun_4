package com.interfaces;

public class CostumerManager {

    // !todo loosly - tightly coupled


    private Logger[] loggers;

    public CostumerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Costumer costumer) {
        System.out.println("Musteri eklendi : " + costumer.getFirstName());

        Utils.runLogger(loggers, costumer.getFirstName());


    }


    public void delete(Costumer costumer) {
        System.out.println("Musteri silindi  : " + costumer.getFirstName());

        Utils.runLogger(loggers, costumer.getLastName());

    }
}

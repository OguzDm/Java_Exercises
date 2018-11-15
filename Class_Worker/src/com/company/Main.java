package com.company;

public class Main {

    public static void main(String[] args) {

        Worker w1=new Worker();
        Worker w2=new Worker("Carlos","Steinberg",140,30);


        w1.setName("Bill");
        w1.setSurname("Carter");
        w1.setWorking_Hours(104);
        w1.setHourly_Payment(50);

        System.out.println("First Worker Name:"+w1.getName()+"\nSurname:"+w1.getSurname()+"\nWork Hours:"+w1.getWorking_Hours()+"\nHourly Payment:"+w1.getHourly_Payment());
        w1.setHourly_Payment(w1.Calculate(w1.getWorking_Hours(),w1.getHourly_Payment()));
        System.out.println("First Worker Name:"+w1.getName()+"\nSurname:"+w1.getSurname()+"\nWork Hours:"+w1.getWorking_Hours()+"\nHourly Payment:"+w1.getHourly_Payment());
    }

}

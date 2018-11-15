package com.company;

public class Worker {
    private String name;
    private String surname;
    private int Working_Hours;
    private int Hourly_Payment;

    public Worker(){

    }
    public Worker(String name,String surname,int Working_Hours,int Hourly_Payment){

        this.name=name;
        this.surname=surname;
        this.Working_Hours=Working_Hours;
        this.Hourly_Payment=Hourly_Payment;
    }
    public int Calculate(int Working_Hours,int Hourly_Payment){
        if (Working_Hours>100){
            int temp=Working_Hours-100;
            Hourly_Payment=Working_Hours*Hourly_Payment+(temp*2);
            return Hourly_Payment;
        }
        Hourly_Payment=Working_Hours*Hourly_Payment;
        return Hourly_Payment;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }

    public String getSurname() {
        return surname;
    }
    public void setWorking_Hours(int Working_Hours){
        this.Working_Hours=Working_Hours;
    }
    public int getWorking_Hours(){
        return Working_Hours;
    }
    public void setHourly_Payment(int Hourly_Payment){
        this.Hourly_Payment=Hourly_Payment;
    }

    public int getHourly_Payment() {
        return Hourly_Payment;
    }
}

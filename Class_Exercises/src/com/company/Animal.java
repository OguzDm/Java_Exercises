package com.company;

public class Animal {
    private int leg;
    private String sound;
    private String diet;
    private boolean isItFly;
    private String name;

    public Animal(int leg,String name,String sound,String diet,boolean isItFly){
       this.leg=leg;
       this.name=name;
       this.sound=sound;
       this.diet=diet;
       this.isItFly=isItFly;
    }
    public Animal(){

    }


    public void setLeg(int leg){
        this.leg=leg;
    }
    public void setSound(String sound){
        this.sound=sound;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
    public void setIsItFly(boolean isItFly){
        this.isItFly=isItFly;
    }


    public void setName(String name){
        this.name=name;
    }

    public int getLeg() {
        return leg;
    }
    public String getSound(){
        return sound;
    }
    public String getDiet(){
        return diet;
    }

    public boolean getisItFly() {
        return isItFly;
    }

    public String getName() {
        return name;
    }

}

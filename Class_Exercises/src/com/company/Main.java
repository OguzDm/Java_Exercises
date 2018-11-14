package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal cat=new Animal(4,"cat","myav","carnivorous",false);
        Animal dog=new Animal(4,"dog","woof","carnivorous",false);
        Animal bird=new Animal(4,"bird","cik","omnivorous",true);
        Animal bee=new Animal(6,"bee","zzzzz","herbivorous",true);

        System.out.println("Leg :"+cat.getLeg()+"\n"+"Name:"+cat.getName()+"\nDiet:"+cat.getDiet()+"\nIs it fly:"+cat.getisItFly()+"\nSound:"+cat.getSound());

        System.out.println("Leg :"+dog.getLeg()+"\n"+"Name:"+dog.getName()+"\nDiet:"+dog.getDiet()+"\nIs it fly:"+dog.getisItFly()+"\nSound:"+dog.getSound());

        System.out.println("Leg :"+bird.getLeg()+"\n"+"Name:"+bird.getName()+"\nDiet:"+bird.getDiet()+"\nIs it fly:"+bird.getisItFly()+"\nSound:"+bird.getSound());

        System.out.println("Leg :"+bee.getLeg()+"\n"+"Name:"+bee.getName()+"\nDiet:"+bee.getDiet()+"\nIs it fly:"+bee.getisItFly()+"\nSound:"+bee.getSound());


    }
}

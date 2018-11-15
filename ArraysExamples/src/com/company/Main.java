package com.company;

public class Main {

    //Passing Array to Method
    public static void printArray(int[] array){

        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array={0,0,0,0,0,0,1,2,4,2,1};
        System.out.println("Grade Distibution:");
        for (int counter=0;counter<array.length;counter++){
            System.out.println((counter*10)+"-"+((counter*10)+10-1)+":"+"\n");
            for (int star=0;star<array[counter];star++){
                System.out.print("*");

            }
            System.out.println();
        }






    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6,7,8,9};
        int[] array2={1,2,3,4,5,6,7,8,9};
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        add(array,array2);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println(array[4]);


        int[] array3=new int[10];
        for (int ct=0;ct<array3.length;ct++){
            array3[ct]=ct*1;
        }
        for (int x:array3) {
            System.out.println(x);
        }

    }
    public static void add(int [] a,int []b){
        for (int ct=0;ct<a.length;ct++){
            a[ct]=a[ct]+b[ct];
        }
    }
}

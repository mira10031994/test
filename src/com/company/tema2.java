package com.company;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
import java.io.*;
public class tema2 {
    public static  void sortArrays(String[] str,int[] str2){
        Arrays.sort(str);
        Arrays.sort(str2);

        List<String> list = new ArrayList<String>();
        Collections.addAll(list, str);
        System.out.println("String array sorted:\n" + list);
        System.out.println("Numeric array sorted:");

        for ( int i = 0; i<str2.length-1;  i++) {
            System.out.print(" " + str2[i]);
        }

    }

    public static  void commonElements(String[] str, String[] str2) { // ex 2
        int i,j;
        for (i=0;i<str.length;i++) {
           for (j=0;j<str2.length;j++) {
               if(str[i].equals(str2[j])) {
                   System.out.print(": "+str[i]);
               }
           }
       }
    }

    public static  void strigCovertToArry(String[] str) { //ex 3
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, str);
        System.out.println(list);
    }

    public static  void iterateThroughElements(String[] str){ //ex 4

        for (int i = 0;i<str.length; i++)

           System.out.print(str[i]+", ");
    }

    public static  void reverseElements(String[] str){ //ex 5
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, str);
        Collections.reverse(list);
        System.out.println("List after reversing :\n" + list);
    }
    public static  void emptyArray(String[] str) { //ex 6
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, str);
        list.clear();
        checkEmptyArray(list);
    }
    public static  void checkEmptyArray(ArrayList str){ //ex 6
        boolean array = str.isEmpty();
        if (array == true)
            System.out.println("Is empty");
        else
            System.out.println("Is not empty");
    }

    public static  void  randomNumbers(){//ex 7
        Random rand = new Random();
        int[] y = new int[10];
        int[] x = new int[10];
        int nr,k=0;
        for (int i = 0; i < 10; i++) {
            y[i] = rand.nextInt(100);
            System.out.print( y[i]+", ");
        }
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            if(y[i]>10) {
                x[k] = y[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
         System.out.print( x[i]+", ");
        }
    }
    public static  void grades() { //ex 8
        Scanner input = new Scanner(System.in);
        int[] y = new int[100];
        int i,k=0;
        for ( i = 0; i <  20; i++) {
            System.out.println("Enter the number: ");
            y[i] = input.nextInt();
            if(y[i]==-1){
                break;
            }
        }
        System.out.println(average(y,i));
    }
    public static  double average(int[] grades, int i){
        double sum = 0,average=0;
        for (int j = 0; j<= i; j++) {
            sum += grades[j];
        }
        average = sum / (i + 1);
        return average;

    }
    public static  void reversCollection(int[] y) { //ex 9
        int[] x = new int[100];
        int i,j=0;
        for ( i = y.length-1; i >= 0; i--) {
                x[j]=y[i];
                j++;
        }
        for (i = 0; i <  y.length; i++) {
            System.out.print( x[i]+", ");
        }
    }
}

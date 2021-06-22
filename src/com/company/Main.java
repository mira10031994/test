package com.company;
import java.util.Scanner;
public class Main {

    public static void CheckOddEven() { //ex1
        Scanner input = new Scanner(System.in);
        int nr;
        System.out.print("Enter number: ");
        nr = input.nextInt();
        if (nr % 2 == 0) {
            System.out.println("The number is even ");
        } else {
            System.out.println("The number is odd ");
        }
        System.out.println("Bye");
    }

    public static void SumAverageInt(){ //ex2
        double sum=0;
        for(int i=1;i<=100;i++) {
            sum=sum+i;
        }
        sum=sum/100;
        System.out.println("The average of numer from 1 to 100 is: "+sum);
    }

    public static void PerfectSquare(){//ex3
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Enter number: ");
        x = input.nextInt();
        double sum=0;
        for(int i=1;i<=x/2;i++) {
            if(i*i==x){
                System.out.println("Number is a pefect square");
                break;
            }
        }
    }

    public static void SumProductMinMax(){//ex4
        Scanner input = new Scanner(System.in);
        int number,number1,number2;
        System.out.print("Enter frist number: ");
        number = input.nextInt();
        System.out.print("Enter second number: ");
        number1 = input.nextInt();
        System.out.print("Enter third number: ");
        number2 = input.nextInt();
        int sum=number+number1+number2;
        System.out.println("Sum of the numbers: "+sum);
        double prod =number*number1*number2;
        System.out.println("Product of the numbers: "+prod);
        int max=number;
        int min=number;
        max= Math.max(number, Math.max(number2, number1));
        min= Math.min(number, Math.min(number2, number1));

        System.out.println("Max of the numbers: "+max);
        System.out.println("Min of the numbers: "+min);

    }
    public static void  Reverse(){//ex5
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.print("Enter the number: ");
        x= input.nextInt();
        y=0;
        while (x>0) {
            y=y*10+x%10;
            x=x/10;
        }
        System.out.println("Reverse number: "+y);

    }
    public static void  CountVowelsDigits() {//ex6
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine(); //reads string.
        int cons = 0, nr = 0;
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                cons++;
            else{
                if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4'||ch == '5' ||ch == '6' || ch == '7' || ch == '8' || ch == '9')
                    nr++;
            }
        }
        System.out.println("numbers of vowels: "+cons);
        System.out.println("numbers: "+nr);
    }

    public static void  InsertAnElement() {//   ex:7
        Scanner input = new Scanner(System.in);
        int nr,m,i,k,p;
        int[] y = new int[100];
        System.out.println("Enter the number of elements: ");
        nr = input.nextInt();
        System.out.print("Enter the elements: ");
        for (i = 0; i < nr; i++) {
            y[i] = input.nextInt();
        }
        System.out.println("Enter the new element: ");
        m= input.nextInt();
        System.out.println("Enter the position of new element: ");
        k= input.nextInt();
        for (i = k; i <=nr; i++) {
            p=y[i];
            y[i]=m;
            m=p;
        }
        for (i = 0; i <=nr; i++) {
            System.out.print(" "+y[i]);
        }

    }

    public static void RemoveOccurrences() {//ex 8
        Scanner input = new Scanner(System.in);
        int nr,m,i,j,k=1,p;
        int[] y = new int[100];
        System.out.println("Enter the number of elements: ");
        nr = input.nextInt();
        System.out.print("Enter the elements: ");
        for (i = 0; i < nr; i++) {
             y[i] = input.nextInt();
        }

        System.out.println("Enter the new element that need to be removed: ");
        m= input.nextInt();
        i=0;
        while(i<=nr) {
            if (y[i]==m){
                for(j=i;j<nr;j++) {
                    y[j]=y[j+1];
                    System.out.print(" "+y[j]);
                    }
                nr--;
                i--;
            }
            i++;
        }

        for (i = 0; i <nr; i++) {
            System.out.print(" "+y[i]);
        }

    }
    public static void BubbleSortAlgorithm() {//ex9
        Scanner input = new Scanner(System.in);
        int nr,i,m;
        int[] y = new int[100];
        System.out.println("Enter the number of elements: ");
        nr = input.nextInt();
        System.out.print("Enter the elements: ");
        for (i = 0; i < nr; i++) {
            y[i] = input.nextInt();
        }

            for (i = 0; i <nr-1; i++) {
                for (int j = 0; j < nr-i-1; j++) {
                    if (y[i] > y[j + 1]) {
                        m = y[j];
                        y[j] = y[j + 1];
                        y[j + 1] = m;
                    }
                }
            }

        for (i = 0; i < nr; i++) {
            System.out.print(" "+y[i]);
        }
        System.out.println(" ");
    }
    public static void ComputeAverage() {//ex 10
        Scanner input = new Scanner(System.in);
        int nr,i,min,max,sum=0,p=0;
        int[] y = new int[100];
        System.out.println("Enter the number of elements: ");
        nr = input.nextInt();
        System.out.print("Enter the elements: ");
        for (i = 0; i < nr; i++) {
            y[i] = input.nextInt();
        }
        min=y[0];
        max=y[0];
        for (i = 1; i < nr-1; i++) {
           max=  Math.max(max,Math.max(y[i], y[i+1]));
           min=Math.min(min,Math.min(y[i], y[i+1]));
        }
        for (i = 0; i < nr; i++) {
            if((y[i]==max)||(y[i]==min)){
                p++;
            }else{
                sum=y[i]+sum;
                System.out.println("Average "+y[i]);

            }
        }
        nr=nr-p;
        double k =sum/nr;
        System.out.println("Average "+k);

    }
    public static void main(String[] args) {

        CheckOddEven();
        SumAverageInt();
        PerfectSquare();
        SumProductMinMax();
        Reverse();
        CountVowelsDigits();
        InsertAnElement();
        RemoveOccurrences();
        BubbleSortAlgorithm();
        ComputeAverage();

    }


}
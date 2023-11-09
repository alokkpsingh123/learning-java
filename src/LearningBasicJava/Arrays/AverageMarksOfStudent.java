package LearningBasicJava.Arrays;

import java.util.Scanner;

public class AverageMarksOfStudent {
    public static void main(String[] args)
    { int avg=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of students:\n");
        int n= sc.nextInt();
        System.out.println("enter the marks:");
        int marks[]= new int[n];                   //input values
        for(int i=0;i<n;i++)
            marks[i]= sc.nextInt();

        for(int i=0;i<n;i++)
        {System.out.print(marks[i]+ " " );avg=avg+marks[i];}  //output values
        avg=avg/n;
        System.out.println("\nthe average marks are"+avg);

    }

}

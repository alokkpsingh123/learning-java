package LearningBasicJava.Arrays;

import java.util.Scanner;

public class AdditionOfMatric {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("\n enter the rows and coloum3\n");

        int ar1[][]= new int[a][b];
        int ar2[][]= new int[a][b];
        int ar3[][]= new int[a][b];

        System.out.println("\nenter the elements of first mattric:\n");
        for(int i=0;i<a;i++)
        { for(int j=0;j<b;j++)
            ar1[i][j]=sc.nextInt();
        }
        System.out.println("\nenter the elements of second mattric:\n");
        for(int i=0;i<a;i++)
        { for(int j=0;j<b;j++)
            ar2[i][j]=sc.nextInt();
        }
        System.out.println("\nthe addition of mattrics is:\n");
        for(int i=0;i<a;i++)
        { for(int j=0;j<b;j++)
            ar3[i][j]=ar1[i][j]+ar2[i][j];
        }

        for(int i=0;i<a;i++)
        { for(int j=0;j<b;j++)
            System.out.print(ar3[i][j]+" ");
            System.out.print("\n");
        }
    }
}

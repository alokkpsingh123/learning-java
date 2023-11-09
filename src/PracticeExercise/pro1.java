package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class pro1 {

    public static void main(String []args){

        System.out.println("Length:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair []arr = new Pair[n];

        System.out.println("Enter st and en");
        for(int i =0;i<n;i++){

            int st = sc.nextInt();
            int en = sc.nextInt();
            Pair p = new Pair(st, en);
            arr[i]= p;
        }

        int output = solve( arr, n);
        System.out.println(output);
    }

    private static int solve(Pair[] arr, int n) {
        int x=Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr,new Comparator<Pair>(){
            public int compare(Pair i1,Pair i2)
            {
                return i1.en - i2.en;
            }
        });

       //code
        int i=0,j=1;

        while(j<n){
            if(arr[i].en >arr[j].st){
                x = arr[j].st;
                i=j;
                j++;

            }else{
                x = arr[i].st;
            }
            ans = Math.min(x,ans);
        }

        return ans;
    }

    static class Pair{
        int st, en;
        Pair(int st, int en){
            this.st = st;
            this.en = en;
        }
    }
}

package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String [] str = br.readLine().split(" ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        int sp[] = new int[n];

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for(int i =0; i<n; i++){
            sp[i] = max - arr[i];
            System.out.println(sp[i]);
        }

        for(int i =0; i<max; i++){
            for (int j =0; j<n; j++){
                if(sp[j] > 0){
                    System.out.print(" ");
                    sp[j]--;
                }else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

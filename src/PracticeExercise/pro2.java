package Practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class pro2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());


        ArrayList<Integer> primeList = new ArrayList<>();
        firstPrime(m, primeList);
        Collections.sort(primeList, Collections.reverseOrder());

        if(primeList.size() ==1){
            System.out.println(n/primeList.get(0));
        }else {
            int mincnt = 0;
            for (int i = 1; i < primeList.size(); i++) {
                int tempcount = n / primeList.get(i - 1);
                if (tempcount < primeList.get(i)) {
                    n = n - (tempcount - 1) * primeList.get(i - 1);
                    mincnt += tempcount - 1;
                } else {
                    n = n % primeList.get(i - 1);
                    mincnt += tempcount;
                }

            }
            System.out.println(mincnt);
        }


    }

    public  static void firstPrime(int m, List<Integer> primeList){


        for(int i = 2; ; i++){
            int cnt =0;
            for(int j = 2; j<i; j++){
                if(i%j ==0){
                    cnt++;
                }
            }
            if(cnt ==0){
                primeList.add(i);
                if(primeList.size() == m){
                    break;
                }
            }

        }

    }

}

package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class pro4 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String []word = str.split(" ");

        int easy = easyCal(word);
        int hard = hardCal(word);
    }
    public static int easyCal(String[] word){
        int ecnt =0; int hcnt =0;
        int cvol =0;


        for(int i =0; i< word.length; i++){
            String tempword = word[i];
            int len = tempword.length();
            for(int j =0; j<tempword.length(); i++){
                if(){
                }
            }
            if(cvol < (len - cvol)){
                ecnt++;
            }
       }



        return ecnt;

    }

    public static boolean isVol(Character c){
        HashSet<Character> st = new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');

        if(st.contains(c)){
            return true;
        }else{
            return false;
        }
    }
}

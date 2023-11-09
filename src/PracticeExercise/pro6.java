package Practice;

import java.util.Scanner;

public class pro6 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();


        int length = input.length();
        int i =1;
        String ans_string = "";
        char prev_char= input.charAt(0);

        while(i<length){

            if(Character.isDigit(input.charAt(i))){
                int count = Integer.parseInt(String.valueOf(input.charAt(i)));
                for(int j=1; j<=count; j++){
                    ans_string+=prev_char;

                }
            }
            prev_char = input.charAt(i) ;
            i++;
        }


        System.out.print(ans_string);

    }
}

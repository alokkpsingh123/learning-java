package Practice;



//{ Driver Code Starts
        import java.util.*;
        import java.io.*;
        import java.lang.*;

class Main {
    public static void main(String args[]) {
        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total number of elements
            int n = sc.nextInt();

            // taking size of subArrays
            int k = sc.nextInt();

            // Declaring and Intializing an array of size n
            int arr[] = new int[n];

            // adding all the elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Calling the method max_of_subarrays of class solve
            // and storing the result in an ArrayList
            ArrayList<Integer> res = new Solution().max_of_subarrays(arr, n, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        int nr[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);


        for(int i = 1; i< arr.length; i++){

            while( st.size()> 0 && arr[st.peek()] <= arr[i]){
                int pos = st.peek();
                nr[pos] = arr[i];
                st.pop();
            }

            st.push(i);

        }
        while(st.size()>0){
            int pos = st.peek();
            nr[pos] = arr.length;
            st.pop();
        }

        int j =0;

        if(arr.length == 1){
            ans.add(arr[0]);
        }else{

            for(int i =0; i<=arr.length-k;i++){
                if(j<i){
                    j=i;
                }
                while(nr[j]< i+k){
                    j = nr[j];
                }

                ans.add(arr[j]);
            }

        }
        return ans;
    }
}
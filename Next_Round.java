import java.io.*;
import java.util.*;

public class Next_Round {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreElements())
            st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    // static long nextLong() throws IOException {
    //     while (st == null || !st.hasMoreElements())
    //         st = new StringTokenizer(br.readLine());
    //     return Long.parseLong(st.nextToken());
    // }

    // static String next() throws IOException {
    //     while (st == null || !st.hasMoreElements())
    //         st = new StringTokenizer(br.readLine());
    //     return st.nextToken();
    // }

    public static void main(String[] args) throws Exception {
        int n = nextInt();
        int k = nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }
        for(int num : arr){
            if(num < arr[k-1] || num == 0){
                n--;
            }
        }
        System.out.print(n);    
    }
}
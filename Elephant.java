import java.io.*;
import java.util.*;

public class Elephant {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreElements())
            st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws Exception {
        int n = nextInt(); // test cases
        int ans = 0;

        if(n%5 == 0){
            ans = n/5;
        } else {
            ans = n/5+1;
        }

        System.out.print(
            ans
        );
    }

}
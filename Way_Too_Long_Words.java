import java.io.*;
import java.util.*;

public class Way_Too_Long_Words {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreElements())
            st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    static long nextLong() throws IOException {
        while (st == null || !st.hasMoreElements())
            st = new StringTokenizer(br.readLine());
        return Long.parseLong(st.nextToken());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreElements())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public static void main(String[] args) throws Exception {
        int t = nextInt(); // test cases
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            sb = new StringBuilder(next());
            solve(sb);
        }
    }

    static void solve(StringBuilder sb) throws Exception {
        if(sb.length()<=10){
            System.out.println(sb.toString());
        } else {
            System.out.println((sb.charAt(0)+""+(sb.length()-2)+""+sb.charAt(sb.length()-1)).toString());
        }
    }
}

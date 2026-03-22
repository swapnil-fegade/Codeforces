import java.io.*;
import java.util.*;

public class Main {

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
            solve(sb);
        }

        System.out.print(sb);
    }

    static void solve(StringBuilder sb) throws Exception {
        int n = nextInt();
        
        // Example logic
        if (n % 2 == 0) {
            sb.append("YES\n");
        } else {
            sb.append("NO\n");
        }
    }
}
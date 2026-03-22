import java.io.*;
import java.util.*;
 
public class Watermeleon {
 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
 
    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreElements())
            st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }
    
    public static void main(String[] args) throws Exception {
        int n = nextInt();
        if(n<=2){ System.out.print("NO"); return;}
        
        if (n % 2 == 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
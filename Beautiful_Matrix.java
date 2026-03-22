import java.io.*;
import java.util.*;

public class Beautiful_Matrix {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreElements())
            st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }
    public static void main(String[] args) throws Exception {
        int arr[][] = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = nextInt();
                if(arr[i][j] == 1){
                    System.out.print(Math.abs(2-i)+Math.abs(2-j));
                    return;
                }
            }
        }    
    }
}
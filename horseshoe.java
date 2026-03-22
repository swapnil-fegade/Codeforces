import java.util.HashMap;
import java.util.Scanner;

public class horseshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = 0;
        for(int i = 0;i<4;i++){
            int n = sc.nextInt();
            hm.put(n, hm.getOrDefault(n, 0)+1);
        }

        for(int i : hm.values()){
            max += i-1;
        }
        System.out.print(max);
    }
}

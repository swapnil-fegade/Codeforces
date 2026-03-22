package Codeforces;

import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sure[] = new int[3];
            for (int j = 0; j < 3; j++) {
                sure[j] = sc.nextInt();
            }
            int count = 0;
            for (int j : sure) {
                if(j == 1){
                    count++;
                }
            }
            if(count >= 2){
                max++;
            } 
        }
        System.out.println(max);
    }
}

import java.util.HashSet;
import java.util.Scanner;

public class boy_or_girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user_name = sc.nextLine();
        HashSet<Character> hs = new HashSet<>();

        for (Character ch : user_name.toCharArray()) {
            hs.add(ch);
        }
        if (hs.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}

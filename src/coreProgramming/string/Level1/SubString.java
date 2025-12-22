import java.util.Scanner;

public class SubString {

    static String getSub(String s, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub = sub + s.charAt(i);
        }
        return sub;
    }

    static boolean compare(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub1 = getSub(s, start, end);
        String sub2 = s.substring(start, end);

        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(compare(sub1, sub2));

        sc.close();
    }
}

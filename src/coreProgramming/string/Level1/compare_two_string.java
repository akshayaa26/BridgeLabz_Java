package coreProgramming.string.Level1;
import java.util.Scanner;
public class compare_two_string {
    public static boolean compare(String a,String b){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        boolean result=compare(a,b);
        System.out.println(result);
        sc.close();
    }
}

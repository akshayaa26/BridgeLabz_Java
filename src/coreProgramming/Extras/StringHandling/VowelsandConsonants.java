package coreProgramming.Extras.StringHandling;
import java.util.*;
public class VowelsandConsonants {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        int v=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch =='a' || ch=='e' || ch=='i'|| ch=='o'||ch=='u'){
                v++;
            }
            else {
                c++;
            }
        }
        System.out.println(v);
        System.out.println(c);
    }
}

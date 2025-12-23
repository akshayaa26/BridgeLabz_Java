package coreProgramming.Extras.StringHandling;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder og= new StringBuilder();
        boolean[] seen = new boolean[256];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!seen[ch]){
                seen[ch]=true;
                og.append(ch);
            }
        }
        System.out.println(og);
    }
}

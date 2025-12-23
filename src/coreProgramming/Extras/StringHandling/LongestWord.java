package coreProgramming.Extras.StringHandling;
import java.util.*;
public class LongestWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        String longest="";
        int max=0;
        for(int i = 0; i < words.length ; i++){
            if(words.length >max){
                max = words.length;
                longest = words[i];
            }
        }
        System.out.println(longest);
    }
}

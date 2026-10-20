package strings;
import java.util.*;

public class string_4{
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());
        
        for(int i =0; i < str.length()/2;i++){
            int first = i;
            int last = str.length()-i-1;

            char firstChar = str.charAt(first);
            char lastChar = str.charAt(last);

            str.setCharAt(first, lastChar);
            str.setCharAt(last, firstChar);
        }
        System.out.println(str);
    }
}
package strings;

import java.util.Scanner;

public class count_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder("banana");
        int count = 0;


        for (int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}

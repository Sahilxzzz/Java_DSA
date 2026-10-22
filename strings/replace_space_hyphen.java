package strings;

public class replace_space_hyphen {
        public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello World java");

        for(int i = 0; i<str.length(); i++){
            char character = '-';
            if(str.charAt(i) == ' '){
                str.setCharAt(i,character);
            }
        }
        System.out.print(str);
    }

}

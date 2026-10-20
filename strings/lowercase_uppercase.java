package strings;

public class lowercase_uppercase {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("heLLo");

for (int i = 0; i < str.length(); i++) {
    char myChar = str.charAt(i);

    if (myChar >= 'a' && myChar <= 'z') {
        myChar -= 32;
        str.setCharAt(i, myChar);
    }
}

System.out.println(str);
    }
}

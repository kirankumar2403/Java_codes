import java.util.*;

class StringTokenizerEx {
    static void reverse(String s) {
        String nstr = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("reverse of given string/word: " + s + " is " + nstr);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Reversing the given string
        reverse(str);

        // Converting string to words and reversing each word
        StringTokenizer st = new StringTokenizer(str);
        System.out.println("no. of tokens " + st.countTokens());
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            reverse(temp);
        }
    }
}

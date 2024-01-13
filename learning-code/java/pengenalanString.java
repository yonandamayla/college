import java.util.Arrays;

public class pengenalanString {
    public static void main(String[] args) {
        String kataString = "hallo";
        char[] kataChar = {'h','a', 'l', 'l', 'o'};

        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        System.out.println("komponen pertama dari char[]" + kataChar [0]);
        System.out.println("komponen pertama dari String " + kataString.charAt(0));
    }
}
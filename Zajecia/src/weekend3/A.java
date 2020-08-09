package weekend3;

public class A {
    public static char[] getSomeChars(String text) {
        char firstChar = text.charAt(0);
        char lastChar = text.charAt(text.length() - 1);
        return new char[]{firstChar, lastChar};
    }
}

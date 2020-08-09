package weekend3;

public class B {
    public String getInvertedText(String text) {
        String newText = "";        // wartosc musi byc pierwotnie stringiem aby nie bylo koneiczne rzutowanie
        for (int i = 0; i < text.length(); i++) {
            newText += text.charAt(text.length() - 1 - i); // dodajemy od tylu....
        }

        return newText;
    }
}

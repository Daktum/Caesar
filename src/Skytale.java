import java.util.ArrayList;
import java.util.Arrays;

public class Skytale {


    public static String encrypt(String word, int faces) {

        StringBuilder out = new StringBuilder();

        for (int i = 0; i <= faces; i++) {
            for (int j = i; j < word.length(); j += faces + 1) {
                out.append(word.charAt(j));
            }
        }

        return out.toString();
    }

    public static String decrypt(String word, int faces) {

        StringBuilder out = new StringBuilder();
        String[] seq = splitWord(word, faces);

        return seq[(seq.length) - 1];
    }

    public static String[] splitWord(String word, int keyLength) {
        String[] out = new String[keyLength];
        String temp = "";

        for (int i = 0; i < keyLength; i++) {
            for (int j = 0; j < word.length() - i; j += keyLength) {
                temp += word.charAt(j + i);
            }
            out[i] = temp;
        }
        //System.out.println(Arrays.toString(out));
        return out;
    }

}

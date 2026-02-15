import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;

public class helper {
    // Counts number of Characters in a String
    public static double[] countChars(String word) {
        StringBuilder s = new StringBuilder();
        double[] charCounts = new double[26];

        for (char c : word.toCharArray()) {
            int i = 0;

            if (s.toString().indexOf(c) < 0) {
                for (char b : word.toCharArray()) {
                    if (b == c) {
                        i++;
                    }
                }
                s.append(c);
                double rel = ((double) i / word.length())*100;
                rel = ((double) Math.round(rel * 100) /100);

                charCounts[c-65] = rel;
                //System.out.println(Arrays.toString(charCounts));
            }
        }

        return charCounts;
    }

    public static boolean checkIfLetter(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}

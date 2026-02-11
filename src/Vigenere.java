import java.io.CharArrayWriter;

public class Vigenere {

    public static String encrypt (String word, String key) {
        key = key.toUpperCase();
        StringBuilder encryptedWord = new StringBuilder();
        int i = 0;
        for(char c : word.toCharArray()){
            if(helper.checkIfLetter(c)){
                int k = (key.charAt(i) - 65) % 26;
                encryptedWord.append((Caeser.decryptChar(c, k)));
                i = (i + 1) % (key.length());
            }else {
                encryptedWord.append(c);
            }
        }
        return encryptedWord.toString();
    }

    public static String decrypt (String word, String key) {
        key = key.toUpperCase();
        StringBuilder encryptedWord = new StringBuilder();
        int i = 0;

        for(char c : word.toCharArray()){
            if(helper.checkIfLetter(c)){
                int k =  (key.charAt(i) - 65) % 26;
                int calcK = Caeser.decryptChar(c, k);
                encryptedWord.append((char) calcK);
                i = (i + 1) % (key.length());
            }else {
                encryptedWord.append(c);
            }
        }
        return encryptedWord.toString();
    }

}

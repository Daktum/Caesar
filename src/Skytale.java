import java.util.Arrays;

public class Skytale {

    public static String encryptGartenzaun(String word){

        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();

        for (int i = 1; i < word.length()+1; i++) {
            if(i%2 == 0){
                temp2.append(word.charAt(i-1));
            }else {
                temp1.append(word.charAt(i-1));
            }
        }

        return temp1.toString() + temp2;

    }

    public static String decryptGartenZaun(String word){

        StringBuilder out = new StringBuilder();

        int halfLength = word.length() / 2 + word.length() % 2;

        for (int i = 0; i < halfLength; i++) {

        }

        return out.toString();
    }


    public static String encrypt(String word, int faces){

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < word.length()/faces; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j  < faces; j++) {
                System.out.println(i+j);
                out.append(word.charAt(j));
            }
        }

        return out.toString();
    }

    public static String decrypt(String word, int faces){

        StringBuilder out = new StringBuilder();
        String[] seq = splitWord(word, faces);

        return seq[(seq.length)-1];
    }

    public static String[] splitWord(String word, int keyLength){
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

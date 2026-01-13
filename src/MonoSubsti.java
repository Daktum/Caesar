public class MonoSubsti {

    public static void main(String[] args) {

        //String key = "NOFRET";



//        String wordToEncrypt = "DIE SCHWALBE HAT UNTER FOLTER ALLES VERRATEN STOP SOFORTIGER ABBRUCH VON OPERATION KLEOPATRA";
        String wordToDecrypt = "ZQ EQR SJQ BZHSJBZJ, YZJ SQ-MPDZQEYZJRZJ YSPLO ZEJZJ SJQZPZP GHKJZ XS ZPQZRXZJ";
        String key = "Dolly";
//
//
//        String encryptedWord = encrypt(wordToEncrypt, key);
        String decryptedWord = decrypt(wordToDecrypt, key);
//
//        System.out.println("Encrypt:" + encryptedWord);
        System.out.println("Decrypt:" + decryptedWord);

        System.out.println(calcKey(""));
        key = calcKey(key);

        System.out.println(key);


    }

    public static String encrypt(String word, String key) {

        String encryptedWord = "";

        for (char c : word.toCharArray()) {
            if (c >= 65 && c <= 90) {
                encryptedWord += key.charAt(c - 65);
            } else {
                encryptedWord += c;
            }
        }
        return encryptedWord;
    }

    public static String decrypt(String word, String key) {
        String decryptedWord = "";

        word = word.toUpperCase();

        for (char c : word.toCharArray()) {
            if (c >= 65 && c <= 90) {
                decryptedWord += (char) (key.indexOf(c) + 65);
            } else {
                decryptedWord += c;
            }
        }
        return decryptedWord;
    }

    public static String calcKey(String key) {
        key = key.toUpperCase();

        char[] charArray = key.toCharArray();
        String sTemp = "";

        for (char c : charArray) {
            if (c >= 65 && c <= 90) {
                if (sTemp.indexOf(c) < 0) {
                    sTemp += c;
                }
            }
        }



        key = sTemp;

        return key;
    }

    public static void countChars(String word) {

        String s = "";
        for (char c : word.toCharArray()) {
            //System.out.println((char) c);
            int i = 0;

            if (s.indexOf(c) < 0) {
                for (char b : word.toCharArray()) {
                    if (b == c) {
                        i++;
                    }
                }
                s += c;
                System.out.print(c);
                System.out.print(" ");
                System.out.println(i);
            }
        }
    }

}

public class Gartenzaun {

    public static String encrypt(String word){

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

    public static String decrypt(String word){

        StringBuilder out = new StringBuilder();

        int halfLength = word.length() / 2 + word.length() % 2;

        for (int i = 0; i < halfLength; i++) {

        }

        return out.toString();
    }
}

public class Skytale {

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

        return temp1.toString() + temp2.toString();

    }

    public static String decrypt(String word){

        StringBuilder out = new StringBuilder();

        String temp1 = "";
        String temp2 = "";

        if (word.length() % 2 == 0){
            temp1 = word.substring(0, word.length()/2);
            temp2 = word.substring(word.length()/2);
        }else{
            temp1 = word.substring(0, word.length()/2);
            temp2 = word.substring(word.length()/2);
        }

        for (int i = 0; i < word.length()/2; i++) {
            out.append(temp1.charAt(i));
            out.append(temp2.charAt(i));
        }

        return out.toString();
    }

}

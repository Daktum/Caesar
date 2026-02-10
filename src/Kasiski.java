import java.util.ArrayList;

public class Kasiski {



    public static ArrayList<Integer> findDuplicates(String word, String subString){
        ArrayList<Integer> place = new ArrayList<>();

        for (int i = 0; i <= word.length(); i++){
            if(word.startsWith(subString, i)){
                place.add(i);
            }
        }
        return place;
    }

    public static void Keylength(ArrayList<Integer> place){



    }

}

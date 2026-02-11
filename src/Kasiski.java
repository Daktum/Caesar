import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

public class Kasiski {



    public static void findDuplicates(String word){

        HashMap<String, ArrayList<Integer>> sub = new HashMap<>();

        String subString = "";

        ArrayList<Integer> place = new ArrayList<>();

        for (int getSub = 0; getSub <= word.length()-2; getSub++){

            subString = word.substring(getSub, getSub+3);

            if(!sub.containsKey(subString)){
                for (int i = 0; i <= word.length(); i++){
                    if(word.startsWith(subString, i)){
                        place.add(i);
                    }
                }
            }
            sub.put(subString, place);
            place.clear();
        }




    }

    public static void Keylength(ArrayList<Integer> place){



    }

}

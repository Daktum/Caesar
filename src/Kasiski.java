import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

public class Kasiski {



    public static HashMap<String, ArrayList<Integer>> findDuplicates(String word){

        HashMap<String, ArrayList<Integer>> sub = new HashMap<>();
        String subString = "";

        for (int getSub = 0; getSub <= word.length()-3; getSub++){
            ArrayList<Integer> place = new ArrayList<>();
            subString = word.substring(getSub, getSub+3);

            System.out.println( subString + " : " + !sub.containsKey(subString));

            if(!sub.containsKey(subString)){

                for (int i = 0; i <= word.length(); i++){
                    if(word.startsWith(subString, i)){
                        place.add(i);
                        System.out.println(place);
                    }
                }
                sub.put(subString, place);
            }


        }

        return sub;


    }

    public static void Keylength(ArrayList<Integer> place){



    }

}

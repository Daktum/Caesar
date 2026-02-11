import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kasiski {

    public static ArrayList<Integer> findDuplicates(String s) {
        ArrayList<Integer> l = new ArrayList<>();

        for(int n = s.length()/2; n >= 4 ; n--) {
            for (int j = 0; j < s.length() - n + 1; j++) {
                String muster = s.substring(j, j + n);
                for (int i = j + 1; i < s.length(); i++) {
                    if (s.startsWith(muster, i)) {
                        int d = i - j;
                        if(!l.contains(d)) {
                            l.add(d);
                        }
                        //System.out.println(muster + ": " + d);
                    }
                }
            }
        }
        return l;
    }

    public static Integer wordLength(ArrayList<Integer> num){

        ArrayList<Integer> divi = new ArrayList<>();

        for (int i : num){
            for(int j = 2; j <= i; j++){
                if(i % j == 0){
                    divi.add(j);
                }
            }
        }

        Collections.sort(divi);



        System.out.println(divi);


        return 0;
    }

}

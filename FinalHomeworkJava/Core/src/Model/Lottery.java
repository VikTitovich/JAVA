package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Lottery {
    public Lottery() {
    }
    public HashMap<String,String> getPrize(String[] namesOfAwards,String[] people){

        HashMap<String,String> winners = new HashMap<>();
        for (int i = 0; i < people.length; i++) {
            winners.put(people[i],namesOfAwards[i]);
        }
        System.out.println(winners.toString());
        return winners;
    }

}

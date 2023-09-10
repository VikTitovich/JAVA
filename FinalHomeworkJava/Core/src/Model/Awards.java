package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Awards {
    private ArrayList<Toy> awardsList = new ArrayList<Toy>();
    public Awards() {
    }

    public ArrayList<Toy> getAwardsList() {
        return awardsList;
    }

    @Override
    public String toString() {
        return "Awards{" +
                "awardsList=" + awardsList +
                '}';
    }


    public ArrayList<Toy> create(ArrayList<Toy> toys, String[] peoples){
        int sumOfFrequencyes=0;
        for (Toy toy:toys) {
            sumOfFrequencyes+= toy.getFrequency();
        }
        for (Toy toy:toys) {
            double countOfToy = Math.round(((toy.getFrequency()*100)/sumOfFrequencyes)*peoples.length/100);
            for (int i = 0; i < countOfToy; i++) {
                awardsList.add(toy);
            }
        }
        return awardsList;
    }
    public String[] namesOfAwards(){
        String[] namesOfAwards = new String[awardsList.size()];
        for (int i = 0; i < namesOfAwards.length; i++) {
            Collections.shuffle(awardsList);
            namesOfAwards[i] = awardsList.get(0).getName();
            awardsList.remove(0);
        }
        return  namesOfAwards;
    }


}

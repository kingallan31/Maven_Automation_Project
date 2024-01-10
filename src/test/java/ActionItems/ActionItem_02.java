package ActionItems;

import java.sql.Array;
import java.util.ArrayList;

public class ActionItem_02 {
    public static void main(String[] args) {

        ArrayList<String> regions = new ArrayList<>();
        regions.add("Queens");
        regions.add("Brooklyn");
        regions.add("Long Island");

        ArrayList<Integer> areaCodes = new ArrayList<>();
        areaCodes.add(11432);
        areaCodes.add(97234);
        areaCodes.add(36789);
        areaCodes.add(47851);

        for (int i = 0; i < regions.size(); i++) {
            System.out.println(" The region is " + regions.get(i) + " and my area code is " + areaCodes.get(i));

        }//end of loop

    }//end of main

}//end of class

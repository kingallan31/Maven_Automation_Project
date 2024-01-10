package Day2_LinearArray;

import java.util.ArrayList;

public class T3_forloop_Arraylist {
    public static void main(String[] args) {
        //declare an arraylist variable
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the countries array list
        countries.add("USA");//index 0
        countries.add("India");//Index 1
        countries.add("Pakistan");//index 2
        countries.add("Bandladesh");//index 3
        countries.add("Mexico");//index 4
        //print out all the countries from the arraylist
        for (int i = 0; i < countries.size(); i++) {
           //print out the value of i to see which iteration we are on
            System.out.println("Index number or iteration number is " + i);
            //print out all countries
            System.out.println("My country is " + countries.get(i));


        }//end of loop
    }// end of main
}// end of class




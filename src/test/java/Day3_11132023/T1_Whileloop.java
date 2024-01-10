package Day3_11132023;

import java.util.ArrayList;

public class T1_Whileloop {
    public static void main(String[] args) {

    //declare an array list of cities
        ArrayList<String> Boroughs = new ArrayList<>();
        Boroughs.add("Brooklyn");
        Boroughs.add("Manhattan");
        Boroughs.add("Queens");
        Boroughs.add("Bronx");
        Boroughs.add("Staten Island");

        //set the initial counter for the while loop
        int i = 0;
        while (i < Boroughs.size()) {
            //first iteration
            // 0 < 5
            //second 1 < 5
            //third 2 < 5
            //fourth 3 < 5
            //fifth 4 < 5
            //sixth it becomes false because 5 < 5 is not true
            //print out the value of i to see which iteration we are on
            System.out.println ("Index number or iteration number is " + i);
            //print out all the countries
            System.out.println("My borough is " + Boroughs.get(i));
            //counter
            i = i + 1;
            //i++; is the same as i = i+ 1;


        }// end of while loop

    }// end of main

}// end of class

package Day2_LinearArray;

import java.util.ArrayList;

public class T2_ArrayList {
    public static void main(String[] args) {
      //declare an arraylist variable
      ArrayList <String> countries = new ArrayList <>();
      //add some values to the countries array list
        countries.add("USA");//index 0
        countries.add("India");//Index 1
        countries.add("Pakistan");//index 2
        countries.add("Bandladesh");//index 3
        //print out USA
        System.out.println("The first country is " + countries.get(0));
        //print out the total size of arraylist
        System.out.println("The total size of countries arraylist is " + countries.size());
        //add another country
        countries.add("Canada");
        //print the new size of the arraylist because you can add them at any time
        System.out.println("The new size of countries arraylist is " + countries.size());
        ArrayList <Integer> studentGrades = new ArrayList<>();
        //add values to student grades
        studentGrades.add(90);//index 0
        studentGrades.add(80);//index 1
        studentGrades.add(20);//index 2
        //print out the last student grade
        System.out.println("The third students grade is " + studentGrades.get(2));
    }//end of main method
}// end of class

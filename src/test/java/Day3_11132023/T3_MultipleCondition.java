package Day3_11132023;

public class T3_MultipleCondition {
    public static void main(String[] args) {
        //declare some int values

        int a = 7;
        int b = 26;
        int c = 42;
        //start of conditional statement

        if (a + b > c) {
            System.out.println("sum of a and b is greater than c");
        } else if ( a + b < c) {
            System.out.println("sum of a and b is less than c");
        } else {
    System.out.println("sum of a and b is equal to c");
        }// end of if else statements

    }//end of main

    public static class T4_ConditionWithLoop {
        public static void main(String[] args) {

            String[] fruitBasket = new String[]{"Grape", "Orange", "Apple", "Mango"};
            //pick out only apple from the basket / array
            //start the for loop because we need to check everything in the basket / array
            for (int i = 0; i < fruitBasket.length; i++) {
                // == (double equal sign) mean its a comparison operator and checking if it does
                // (single equal sign) assigns a value to variable
                if (fruitBasket[i] == "Apple") {
                    System.out.println("an apple a day keeps the defects away");
                }//end of if clause
                else if (fruitBasket[i] == "Grape") {
                    System.out.println("My fruit is " + fruitBasket[i]);
                }//end of else if

            }//end of loop
        }//end of main

    }//end of class
}//end of class


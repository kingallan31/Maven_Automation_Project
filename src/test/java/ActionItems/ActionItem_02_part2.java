package ActionItems;

public class ActionItem_02_part2 {
    public static void main(String[] args) {
        //give value
        int grade =82;
        //start condiitonal statement
        if (grade >= 90 && grade <=100) {
            System.out.println("Grade A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Grade B");
        } else if (grade >= 70 && grade <80) {
            System.out.println("Grade C");
        } else if (grade >= 60 && grade <70) {
            System.out.println("Grade D");
            }else {
            System.out.println("Grade F");
        }// end of condition

    }//end of main


}//end of class

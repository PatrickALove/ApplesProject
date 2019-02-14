/* This program is my original work.
*    Programmer: Patrick Andrew Love
*    Date: 2-6-19
*
*    Edit dates: 2-9-19 4:34am
*                2-10-19 9pm
*                2-11-19 11:22am
*                2-12-19
*                                       */

import java.sql.SQLOutput;
import java.util.Scanner;  // import the scanner class utility

public class ApplesProject1 {
    public static void main(String[] args) {
        //Declarations of variables for use in the program
        double applePie=10.00, appleCider=8.00, appleCobbler=15.00;
        int numOfApplesCollected, numOfStudents, dividedApples, leftover;
        double teacherItemPrice=0, totalPrice,collectionPrice=0;
        final double tax = .07;
        String teacherLastName;
        String teacherLastNameCorrected;
        String teacherSalutation;
        String teacherSalutationCorrected;
        String teacherChoice;
        String dayOfWeek;


        //-------------------------------------------------------------------
        //                        Import New Scanner
        //-------------------------------------------------------------------
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the number of apples collected");
        numOfApplesCollected =input.nextInt();
        input.nextLine(); // here to catch newline leftover
        System.out.println("Please enter the day of the week, be sure to spell out the whole day. Capitalize the first letter.");
        dayOfWeek=input.nextLine();
        System.out.println("Please enter the number of students");
        numOfStudents= input.nextInt();
        input.nextLine();
        System.out.println("Please enter your last name");
        teacherLastName= input.nextLine();
        teacherLastNameCorrected=teacherLastName.substring(0,1).toUpperCase()+teacherLastName.substring(1);

        System.out.println("Please enter your Salutation");
        teacherSalutation=input.next();
        teacherSalutationCorrected= teacherSalutation.substring(0,1).toUpperCase()+teacherSalutation.substring(1,4);
        //input.nextLine();

        dividedApples=numOfApplesCollected/ numOfStudents;
        leftover=numOfApplesCollected%numOfStudents;


        // if and else to determine discounts
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday")|| dayOfWeek.equals("Wednesday")) {
            applePie = 10.00;
            appleCider= 8.00;
            appleCobbler=15.00;
        }
        else if (dayOfWeek.equals("Thursday")|| dayOfWeek.equals("Friday")) {
            applePie = 8.0;
            appleCider= 6.00;
            appleCobbler= 13.00;
        }
        else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            applePie = 7.00;
            appleCider= 5.00;
            appleCobbler= 12.00;
        }


        switch(numOfApplesCollected/10) {
            case 0:
                collectionPrice=0;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("case 4");
                collectionPrice=10.0;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Case 9");
                collectionPrice=15.00;
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                collectionPrice=20.00;
                break;
            default: collectionPrice=30.0;
        }


        System.out.println(teacherSalutationCorrected+" "+teacherLastNameCorrected+", you have "+ dividedApples + " apples per student with " + leftover + " leftover for you\n");

        //Begin Menu for teacher choice
        System.out.println("Apple Pie-$" +applePie + " "+ "Apple Cobbler-$"+appleCobbler+ " " + "Apple Cider-$"+appleCider+"\n");  // Show the teacher the options
        input.nextLine();
        System.out.println("Please type in your choice or type 'None' ");
        teacherChoice=input.nextLine();
        //input.nextLine();

        //begin if/else to determine the teacher's choice
        if (teacherChoice.equals("Apple Pie") || teacherChoice.equals("apple pie")) {
            teacherItemPrice=applePie;
            System.out.println("Apple Pie-$"+ applePie);
            if (applePie<10.00) {
                System.out.println("Great Choice," + teacherSalutationCorrected+ "-"+ teacherLastName +" "+ teacherChoice +" is on sale today, " +dayOfWeek+ ", for $" + applePie);
            }
        }
        else if (teacherChoice.equals("Apple Cobbler")|| teacherChoice.equals("apple cobbler")) {
            teacherItemPrice=appleCobbler;
            System.out.println("Apple Cobbler-$"+ appleCobbler);
            if (appleCobbler<15.00) {
                System.out.println("Great Choice," + teacherSalutationCorrected+ "-"+ teacherLastName +" "+ teacherChoice +" is on sale today, " +dayOfWeek+ ", for $" + appleCobbler);
            }
        }
        else if (teacherChoice.equals("Apple Cider") || dayOfWeek.equals("apple cider")) {
            teacherItemPrice=appleCider;
            System.out.println("Apple Cider-$"+ appleCider);
            if (appleCider<8.00) {
                System.out.println("Great Choice," + teacherSalutationCorrected+ "-"+ teacherLastName +" "+ teacherChoice +" is on sale today, " +dayOfWeek+ ", for $" + appleCider);
            }
        }
        else if (teacherChoice.equals("None")) {
            teacherItemPrice=0;
        }



        //final output of the price
        totalPrice=(collectionPrice+teacherItemPrice)*tax;
        double finalPrice=(collectionPrice+teacherItemPrice)+totalPrice;
        System.out.println("Your total today(collection plus teacher item):   $"+finalPrice);


        //Test output to make sure variables are working
        System.out.println(numOfApplesCollected+ " "+dayOfWeek +" "+numOfStudents+ " "+ teacherLastName +" "+teacherSalutation + " " +teacherChoice);
    }


}

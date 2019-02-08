import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String userName;
        Scanner keyboard;




        //initializing
        keyboard= new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        double weight;
        int feet;
        int inches;


        System.out.println("What is your name?");
        userName = keyboard.nextLine();

        System.out.println("What is your height in only feet?");
        feet = reader.nextInt();

        System.out.println("What is your height in only inches?");
        inches = reader.nextInt();

        System.out.println("How much do you weigh in pounds?");
        weight = reader.nextInt();


        System.out.println(""+userName+",this is your BMI equation");
        inches = inches + (feet * 12);
        double meters = inches * 0.0254;
        weight = weight * 0.453592;
        double BMI = weight / (meters * meters);

        System.out.println(BMI);



















    }
}

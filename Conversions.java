import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Oscar Bruce
 * @version 8/23/2024
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Miles to Kilometers");
        System.out.println("8. Kilometers to Miles");
        System.out.println("9. Gallons to Liters");
        System.out.println("10. Liters to Gallons");

        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees Celsius");
        }
        if (selection == 3)
        {
            System.out.println("Enter feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double Meters = feet * 3.28084;
            System.out.println(feet + "Feet is " + Meters + "Meters");   
        }if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double Meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = Meters * 0.3048;
            System.out.println(Meters + " Meters is " + feet + " Feet");      //add the code to ask the user to enter Meters and then convert to Feet
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double Ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double Millileters = Ounces * 29.5735;// add the code to ask the user to enter Ounces and then convert to Millileters
            System.out.println(Ounces + " Ounces is " + Millileters + " Millileters");
       }
        if (selection == 6)
        {
            System.out.println("Enter Millileters: ");
            double Millileters = keyboard.nextDouble();
            keyboard.nextLine();
            double Ounces = Millileters * 0.033814;// add the code to ask the user to enter Ounces and then convert to Millileters
            System.out.println(Millileters + " Millileters is " + Ounces + " Ounces");   //add the code to ask the user to enter Millileters and then convert to Ounces
        }
        if (selection == 7)
        {
            //add the code to ask the user to enter Miles and then convert to Kilometers
        }
        if (selection == 8)
        {
            //add the code to ask the user to enter Kilometers and then convert to Miles
        }
        if (selection == 9)
        {
            //add the code to ask the user to enter Gallons and then convert to Liters
        }
        if (selection == 10)
        {
            //add the code to ask the user to enter Liters and then convert to Gallons
        }
    }
}
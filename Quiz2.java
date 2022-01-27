// Student: Musa Waghu
// Course: CS1400
// Professor: David Johannsen

import java.util.Scanner;
public class Quiz2
{
    public static void main(String[] args)
    {
        int number;
        System.out.println("Enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0)
        {
            System.out.println("zing!");
        }
        else if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0)
        {
            System.out.println("plort!");
        }
        else if (number % 3 == 0 && number % 5 == 0)
        {
            System.out.println("brang!");
        }
        else if (number % 3 == 0 && number % 7 == 0)
        {
            System.out.println("brang!");
        }
        else if (number % 5 == 0 && number % 7 == 0)
        {
            System.out.println("brang!");
        }
        else if (number % 3 == 0 || number % 5 == 0 || number % 7 == 0)
        {
            System.out.println("snizz!");
        }
    }
}

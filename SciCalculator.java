//imports scanner utility
import java.util.Scanner;
//imports the format for rounding to a specific decimal place
import java.text.DecimalFormat;

public class SciCalculator
{
    //Main Program
    public static void main(String[] args)
    {
        //Prepares scanner for use
        Scanner myScanner = new Scanner(System.in);
        //Sets the decimal format to round to the second decimal place
        DecimalFormat df = new DecimalFormat("###.##");
        //Initializes first operand
        double first;
        //Initializes second operand
        double second;
        //Initalizes menu input
        int menuIn = 1;
        //Initializes answer output
        double answerOut;
        //Counts number of times a result is produced
        int numCount = 0;
        //Sums all of the results
        double sumResult = 0;
        answerOut = 0;
        //Prints the current result
        System.out.println("Current Result: " + answerOut);

        //Prints the menu and its options
        System.out.println("");
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
        System.out.println("");

        while (menuIn != 0)
        {
            //Requests user to input a menu selection
            System.out.print("Enter Menu Selection: ");
            //Allows user to enter a selection
            menuIn = myScanner.nextInt();

            //Produces error code whenever a number other than 0-7 is used
            if (menuIn < 0 || menuIn > 7)
            {
                System.out.println("");
                System.out.println("Error: Invalid selection!");
                System.out.println("");
                System.out.print("Enter Menu Selection: ");
                menuIn = myScanner.nextInt();
            }

            //Occurs when 0 is inputted (Exit Program)
            if (menuIn == 0)
            {
                System.out.println("");
                System.out.println("Thanks for using this calculator. Goodbye!");
                //Ends loop and exits program
                System.exit(0);
            }

            //Occurs when 1 is inputted (Addition)
            if (menuIn == 1)
            {
                //Requests user to input first operand
                System.out.print("Enter first operand: ");
                first = myScanner.nextDouble();
                //Requests user to input second operand
                System.out.print("Enter second operand: ");
                second = myScanner.nextDouble();
                System.out.println("");
                //Adds the first operand to the second operand
                answerOut = first + second;
                //Prints the result
                System.out.println("Current Result: " + answerOut);
                //Adds 1 to the number of results for use in averaging
                numCount++;
                //Adds result to the sum of all the results for use in averaging
                sumResult = sumResult + answerOut;
                //Prints the menu and its options
                System.out.println("");
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("");
            }

            //Occurs when 2 is inputted (Subtraction)
            if (menuIn == 2)
            {
                //Requests user to input first operand
                System.out.print("Enter first operand: ");
                first = myScanner.nextDouble();
                //Requests user to input second operand
                System.out.print("Enter second operand: ");
                second = myScanner.nextDouble();
                System.out.println("");
                //Subtracts the second operand from the first
                answerOut = first - second;
                //Prints result
                System.out.println("Current Result: " + answerOut);
                //Adds 1 to the number of results for use in averaging
                numCount++;
                //Adds result to the sum of all the results for use in averaging
                sumResult = sumResult + answerOut;
                //Prints the menu and its options
                System.out.println("");
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("");
            }

            //Occurs when 3 is inputted (Multiplication)
            if (menuIn == 3)
            {
                //Requests user to input first operand
                System.out.print("Enter first operand: ");
                first = myScanner.nextDouble();
                //Requests user to input second operand
                System.out.print("Enter second operand: ");
                second = myScanner.nextDouble();
                System.out.println("");
                //Multiplies first operand by the second operand
                answerOut = first * second;
                //Prints result
                System.out.println("Current Result: " + answerOut);
                //Adds 1 to the number of results for use in averaging
                numCount++;
                //Adds result to the sum of all the results for use in averaging
                sumResult = sumResult + answerOut;
                //Prints the menu and its options
                System.out.println("");
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("");
            }

            //Occurs when 4 is inputted (Division)
            if (menuIn == 4)
            {
                //Requests user to input first operand
                System.out.print("Enter first operand: ");
                first = myScanner.nextDouble();
                //Requests user to input second operand
                System.out.print("Enter second operand: ");
                second = myScanner.nextDouble();
                System.out.println("");
                //Divides first operand by second
                answerOut = first / second;
                //Prints result
                System.out.println("Current Result: " + answerOut);
                //Adds 1 to the number of results for use in averaging
                numCount++;
                //Adds result to the sum of all the results for use in averaging
                sumResult = sumResult + answerOut;
                //Prints the menu and its options
                System.out.println("");
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("");
            }

            //Occurs when 5 is inputted (Exponentiation)
            if (menuIn == 5)
            {
                //Requests user to input first operand
                System.out.print("Enter first operand: ");
                first = myScanner.nextDouble();
                //Requests user to input second operand
                System.out.print("Enter second operand: ");
                second = myScanner.nextDouble();
                System.out.println("");
                //Raises first operand to the power of the second operand
                answerOut = Math.pow(first, second);
                //Prints result
                System.out.println("Current Result: " + answerOut);
                //Adds 1 to the number of results for use in averaging
                numCount++;
                //Adds result to the sum of all the results for use in averaging
                sumResult = sumResult + answerOut;
                //Prints the menu and its options
                System.out.println("");
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("");
            }

            //Occurs when 6 is inputted (Logarithm)
            if (menuIn == 6)
            {
                //Requests user to input first operand (base)
                System.out.print("Enter first operand: ");
                first = myScanner.nextDouble();
                //Requests user to input second operand (yield)
                System.out.print("Enter second operand: ");
                second = myScanner.nextDouble();
                System.out.println("");
                //Calculates logarithm based on the base and yield
                answerOut = Math.log10(second)/Math.log10(first);
                //Prints result
                System.out.println("Current Result: " + answerOut);
                //Adds 1 to the number of results for use in averaging
                numCount++;
                //Adds result to the sum of all the results for use in averaging
                sumResult = sumResult + answerOut;
                //Prints the menu and its options
                System.out.println("");
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("");
            }

            //Occurs when 7 is inputted (Display Average)
            if (menuIn == 7)
            {
                //Prints error if there are no results to average
                if (numCount == 0)
                {
                    System.out.println("");
                    System.out.println("Error: No calculations yet to average!");
                    System.out.println("");
                }

                //Displays average
                if (numCount != 0)
                {
                    System.out.println("");
                    //Prints sum of all results
                    System.out.println("Sum of calculations: " + sumResult);
                    //Prints number of results
                    System.out.println("Number of calculations: " + numCount);
                    //Calculates average of results
                    answerOut = sumResult/numCount;
                    //Prints average rounded to 2 decimal places
                    System.out.println("Average of calculations: " + df.format(answerOut));
                    System.out.println("");
                }
            }
        } 
    }
}
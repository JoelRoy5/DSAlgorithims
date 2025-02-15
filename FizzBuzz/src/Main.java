// Made by JoeRoy5 02/14/2025
// Print 1-100
// For every number divisible by 3 print "Fizz"
// For every number divisible by 5 print "Buzz"
// For every number divisible by 3 and 5 print "FizzBuzz"
// else, print the integer

import java.lang.Object;
public class Main
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 100; i++)
        {
            System.out.println(FizzBuzz(i));

        }

    }

    public static String FizzBuzz(int number)
    {
        if ((number % 3 == 0) && (number % 5 == 0))
        {
            return "FizzBuzz";
        }
        if (number % 3 == 0)
        {
            return "Fizz";
        }
        if (number % 5 == 0)
        {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
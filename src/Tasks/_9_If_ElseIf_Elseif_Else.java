package Tasks;
/*Given a int number
        -print "fizz" when given number is divisible by 5
        -print "buzz" when given number is divisible by 3
        -print "fizzbuzz" when given number is divisible by both 3 and 5
        -print same number if it is not divisible by 3 or 5
        Examples:
        input1 -> 10 | output1 -> fizz
        input2 -> 9  | output2 -> buzz
        input3 -> 30 | output3 -> fizzbuzz
        input4 -> 7  | output4 -> 7

 */

import java.util.Scanner;

public class _9_If_ElseIf_Elseif_Else {
    public static void main(String[] args) {

        System.out.println("please insert a number");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();

        if (userNum % 5 == 0 && userNum % 3 == 0)
            System.out.println("fizzbuzz");
        else if (userNum % 3 == 0)
            System.out.println("buzz");
        else if (userNum % 5 == 0)
              System.out.println("fizz");
        else
            System.out.println(userNum);
    }
}

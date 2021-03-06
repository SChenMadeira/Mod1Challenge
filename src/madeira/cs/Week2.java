package madeira.cs;

import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {
        /*
            Problem I
            --------
            Write a program that prints your full name
            You must:
                a. Print your full name on a single output line
                b. Use 1 print statement for each part of your name (i.e. first, middle, last)
         */
        System.out.print("Corinna ");
        System.out.println("Chen");

        /*
            Problem II
            --------
            Write a program that prints "Hello World"
            You must:
                a. Print on two separate lines
                b. Not use the "println()" method
         */
        System.out.print("Hello \nWorld\n");
        /*
            Problem III
            --------
            Write a program that reads your age in years
            You must:
                a. Print the variable type of their age (i.e. int)
         */
        Scanner MyAge = new Scanner(System.in);
        System.out.println("Enter Your Year of Birth");
        int Year = MyAge.nextInt();
        System.out.println(2020 - Year);

        /*
            Problem IV
            --------
            Write a program that reads your first and last name (in two separate prompts).
            You must:
                a. Notify the user whether they've entered your first or last name
                b. The names can be entered in any order
         */

        Scanner MyName = new Scanner(System.in);
        System.out.println("Enter Your First Name");
        String FirstName = MyName.nextLine();
        boolean a = true;
        a = FirstName.equals("Corinna");
        System.out.println(a);


        System.out.println("Enter Your Last Name");
        String LastName = MyName.nextLine();
        boolean c = true;
        c = LastName.equals("Chen");
        System.out.println(c);


        /*
            Problem V
            --------
            Fix the errors such that the following will print false.
            You must:
                a. Only change the numbers, not the boolean assignment
         */
        int i = 0;
        int x = 3;
        int j = 2;
        boolean b = false;
        b = j % x == i;
        System.out.println(b);



        // ==================
        // EXTRA CREDIT BELOW
        // ==================


        /*
            Problem VI
            --------
            Write a program that prints your age in 5 years
            You must:
                a. Read your current age
                b. Manipulate that number
         */

        Scanner MyAge1 = new Scanner(System.in);
        System.out.println("Enter Your age");
        int Age = MyAge1.nextInt();
        System.out.println(Age +5);

        /*
            Problem VII
            --------
            Write a program that reads 3 numbers, sums them & divides the sum by 2
            You must:
                a. Print the result
                b. Use a mix of decimals and integers
                c. Your result should be a decimal
         */
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter First Number");
        int Num1 = Num.nextInt();
        System.out.println("Enter Second Number");
        int Num2 = Num.nextInt();
        System.out.println("Enter Third Number");
        int Num3 = Num.nextInt();
        float sum = Num1+Num2+Num3;
        float Res = sum/2;
        System.out.println(Res);

        /*
            Problem VIII
            --------
            Write a program that reads in a string and identifies if the string is your name
            You must:
                a. Give the user 3 guesses
                b. Present them with a success or fail message
         */
        Scanner MyName2 = new Scanner(System.in);
        System.out.println("Guess My Name");
        String GuessName1 = MyName2.nextLine();
        if (GuessName1.equals("Corinna"))
            System.out.println("Success");
        else
            System.out.println("Fail");

        System.out.println("Guess My Name");
        String GuessName2 = MyName2.nextLine();
        if (GuessName2.equals("Corinna"))
            System.out.println("Success");
        else
            System.out.println("Fail");

        System.out.println("Guess My Name");
        String GuessName3 = MyName2.nextLine();
        if (GuessName3.equals("Corinna"))
            System.out.println("Success");
        else
            System.out.println("Fail");

        /*
            Problem IX
            --------
            Write a program that reads input from a file called "readme.txt"
            You must:
                a. Print the content of the file
            Hints:
                a. Create the file, write some stuff, save it to the same folder as your program
         */







        /*
            Problem X
            --------
            Write a program that reads a 10 digit number & adds 1 to each DIGIT in the number.
            Print the result as a recombined whole number
            e.g.
            Initial number: 12345678910
            New number: 234567891011
         */
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter a 10 digit number");
        int NUM = Number.nextInt();












    }
}

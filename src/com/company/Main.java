package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//This program contains all the exercises for the Java basics - 2 programs are at the end b/c i figured out I missed them in the canvas.
// 0 Hello World Program
  /*      System.out.println("Hello, World!");
        System.out.println("Today is January 21, 2020. I am alive!");
  */
// Scanners are used for all the programs written down.
        Scanner keyboard = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
/*// 1.  Math Two tested
        int myNumber = 2;
        double namedMyOhterNubmer = 1.7938;
        System.out.println("My Number = " + myNumber + "\nMy Other Number = " + namedMyOhterNubmer);


 // 2.Your assignment.... Scanner Class next tested
        System.out.println("Enter your details ?");
        String firstInitial = sc.next();
        String lastName = sc.next();
        String houseNumber = sc.next();
        String streetName = sc.next();
        String streetType = sc.next();
        String city = sc.next();
        System.out.print(firstInitial + "\n" + lastName + "\n" + houseNumber + "\n");
        System.out.println(streetName + "\n" + streetType + "\n" + city);


//3. Average Nubmers tested
        int num11, num21, num3;
        System.out.print("First temperature? ");
        num11 = keyboard.nextInt();
        System.out.print("Second temperature? ");
        num21 = keyboard.nextInt();
        System.out.println("The average value is : " + (num11 + num21) / 2.0);


//4. Pet's name tested

        String name;
        String breed;
        int age;

        System.out.print("Greetings. What is your pet's name? ");
        name = keyboard.next();

        System.out.print("What kind of animal is " + name + "? ");
        breed = keyboard.next();
        System.out.print("How old is " + name + "? ");
        age = keyboard.nextInt();
        System.out.println(name + " is your " + breed + " and it is " + age);

//5. Print Grades tested

       char input = 'Y';
        String grade;
        while (Character.toUpperCase(input) != 'N') {
            System.out.println("Enter Your Score?");
            double score = sc.nextDouble();
            if (score >= 97 && score <= 100) {
                System.out.println("Good Job. Your grade is A+.");
            } else if (score >= 94 && score <= 96) {
                System.out.println("Good Job. Your grade is A.");
            } else if (score >= 90 && score <= 93) {
                System.out.println("Good Job. Your grade is A-.");
            } else if (score >= 87 && score <= 89) {
                System.out.println("Good Job. Your grade is B+.");
            } else if (score >= 84 && score <= 86) {
                System.out.println("Good Job. Your grade is B.");
            } else if (score >= 80 && score <= 83) {
                System.out.println("Good Job. Your grade is B-.");
            } else if (score >= 77 && score <= 79) {
                System.out.println("Good Job. Your grade is C+.");
            } else if (score >= 74 && score <= 76) {
                System.out.println("Good Job. Your grade is C.");
            } else if (score >= 70 && score <= 73) {
                System.out.println("Good Job. Your grade is C-.");
            } else if (score >= 60 && score <= 69) {
                System.out.println("Good Job. Your grade is D.");
            } else System.out.println("Go back to School if you get below 60");
            System.out.println("Do you want to enter another score (Y/N)?");
            input= sc.next().charAt(0);
        }
//6 What If Completion Activity - Output the sum, product,and average of num1 and num2. tested
        int num1, num2;
        int sum, product;
        double average;
        System.out.print("First number? : ");
        num1 = keyboard.nextInt();
        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();
        sum = num1 + num2;
        product = num1 * num2;
        average = sum / 2.0;
        if (sum > 200 && sum < 1000)
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + "*~");
        else if (sum > 1000) {
            System.out.println("The sum of  " + num1 + " and " + num2 + " is " + sum + "*");
        } else {
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        }
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
        System.out.println("The average of " + num1 + " and " + num2 + " is " + average);

// 7 Switch tested
        System.out.println("Enter the month ");
        int month = sc.nextInt();
        String monthName;
        switch (month) {
            case 28 :  monthName = "February";
            case 29 :  monthName= "February, note it is a leap year.";
                break;
            case 30:  monthName = "April, June,September,November";
                break;
            case 31:  monthName = "January, March, May,July,August,October, December";
                break;
            default: monthName = "No Months have exactly " + month + " days";
          }
        System.out.println(monthName);

//8 Repeating yourself while loop tested
        int secretNumber, guess = 0;//guess is initialized to 0

        secretNumber = 123;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();

        while ( guess != secretNumber )
        {
            System.out.println("\nYou are wrong. Try again.");
            System.out.println("Enter the number: ");
            guess = keyboard.nextInt();
            if(guess==5) break;
        }

        System.out.println("You are correct. You win a prize!");
        //keyboard.close(); this will hinder my next program so i commented it

//9 Loop completion activity tested
        int num, total = 0;
        String append;
        for (int i = 0; i < 10; i++) {
            int control = i + 1;
            if (control == 1) append = " st";
            else if (control == 2) append = " nd";
            else if (control == 3) append = " rd";
            else append = " th";
            System.out.println("Enter " + control + append + " number ?");
            num = keyboard.nextInt();
            total += num;
        }
        System.out.println("The total of all 10 numbers is " + total);
// 10  iffyLoop tested
        int counter = 0;
        String outPut = "";// = new StringBuilder();

        while (counter < 5) {
            System.out.println("Enter a word ?");
            outPut += keyboard.next();
            outPut += " ";
            counter += 1;
        }
        System.out.println("Here are your words :" + outPut);

        String outer = "Y";
    while (outer.equalsIgnoreCase("Y")) {//iffyOne.equalsIgnoreCase("y") || iffyOne.equalsIgnoreCase("yes")) {
        System.out.println("Are your eyes red ? type y or yes");
        String redEyes = keyboard.next();
        if (redEyes.equalsIgnoreCase("Y") || redEyes.equalsIgnoreCase("Yes")) {

            System.out.println("Get some sleep");
            System.out.println("Do you want to try again (Y/N)");
            outer = keyboard.next();
        } else {
            System.out.println("You look great");
            System.out.println("Do you want to try again (Y/N)");
            outer = keyboard.next();
        }

    }


// All Loops tested
//11 print 1 to 10
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);

        }
//12 print 10 to 1
        for (int i = 10; i > 0; i--) {
            System.out.println(i);

        }
//13 Odd Nubmers
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " ");
            }
        }
//14 Even Nubmers
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
//15 Print userNumber to 1
        System.out.println("Enter Your Number");
        int userNumber = keyboard.nextInt();
        for (int i = userNumber; i >= 1; i--) {
            System.out.println(i + " ");
        }

//16 Sum 1 to 10
        int sumToTen = 0;
        for (int i = 1; i <= 10; i++) {
            sumToTen += i;

        }
    System.out.println("Sum from 1 to 10 : " + sumToTen);

//17 Sum from userNumber to 1
        System.out.println("Enter Your Number");
        int userNumberToSum= keyboard.nextInt();
        int userToSum=0;
        for (int i = userNumberToSum; i >= 1; i--) {
            userToSum += i;
            System.out.println("Sum from Your " + userNumberToSum +" to 1 is : " + userToSum);
        }
//18 Pattern One
        for(int i=0; i<4; i++){
            System.out.println("**********");
        }

//19  Pattern Two
        for(int i=0; i<5; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//20 Pattern Three tested
        for (int i = 5; i >=1; i--) {
            System.out.println();
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i ; k--) {
                System.out.print("*");
            }
            //}
        }

//21 Guessing Game tested
        int yourGuess = 11;
        Random rn = new Random();
        int secretNumber1 =  1 + rn.nextInt(11);
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        while (yourGuess != secretNumber1) {
            System.out.println("Enter Your guess ?");
            yourGuess = keyboard.nextInt();
            if (secretNumber1 != yourGuess) {
                System.out.println("Your guess:" + yourGuess);
                System.out.println("That is incorrect. Guess again.");

            }
            else {
                System.out.println("That is right! You're a good guesser.");

            }
        }


//22 Factorial tested
        int factorialOf= 0;
        int factorialResult= 1;
        System.out.println("Enter a number ?");
        factorialOf = keyboard.nextInt();
        while(factorialOf > 1)
        {
            factorialResult *= factorialOf;
            factorialOf-= 1;

        }
        System.out.println("Factorial of " + factorialOf + " is " + factorialResult);



//23 FizzBuzz tested
// print 1 to 100
        System.out.println("Numbers from 1 to 100 are :");
        for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Fizzbuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else
                    System.out.println(i);
        }

//24 String Assignmet tested
        System.out.println("Enter Your name ?");
        String myName = keyboard.nextLine();
        System.out.println("Your name is " + myName);

//25 Comparing Strings
       System.out.println("How is the weather?");
        String answer = sc.nextLine();

        if (answer.equals("rain")) {
            System.out.println("Take your umbrella!");
        } else if (answer.equals("windy")) {
            System.out.println("Wear your jacket!");
        } else if (answer.equals("snow")) {
            System.out.println("Wear a coat and take a shovel!");
        } else {
            System.out.println("Enjoy your day!");
        }
//26 Using Substring() , length() and charAt()

        System.out.println("Enter a word :");
        String word = keyboard.next();
        System.out.println("Enter a number as an Index :");
        int index = keyboard.nextInt();

        System.out.println("The length of the "+ word +  " is: " + word.length());
        if(index > word.length()-1) {
            System.out.println("Index is larger than length");
        }
        else
            System.out.println("The substring from 0 to " + index + " is:" + word.substring(0, index));

//27 has moved all at the end b/c it uses a function call in the main and the } is problematic when commented

// 28  Print Squares tested ( choose one)

        System.out.println("********");
        for (int i = 0; i < 4; i++) {

            System.out.println("*      *");
        }
        System.out.println("********");
//29 Escape Sequence || tested
        String first = String.format("Cost\t  Quantity\tTotal");
        System.out.println(first);
        String second = String.format("$%,6.2f\t%d\t  $%,6.2f ", 1000.00, 4, 4000.00);
        System.out.println(second);
        String third = String.format("$%,8.2f\t%d\t    $%,5.2f", 50.00, 8, 400.00);
        System.out.println(third);
        System.out.println("___________________________");
        String fourth = String.format("TOTAL:\t    %d\t  $%,6.2f", 12, 4400.00);
        System.out.println(fourth);

//27 Randomness Debugging Activity Tested

     output("Generate 10 random integers between 0 and 6");
        Random rnd = new Random();

        for (int i = 1; i <= 10; i++) {
            int randomInt = rnd.nextInt(7);
            output("Generated number "  + i + ": "+ randomInt);
        }

        output("Done.");
        // end of main when we need to use the ff out function call
      }// end of main when

        private static void output(String aMessage) {
            System.out.println(aMessage);
        }*/
// added later on 1
  /*      for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
        }*/

// added later on 2
  /*      double loanAmount = 0;
        double interestAmount = 0;
        double monthlyPayment = 0;
        double balance = 0;
        int termOfLoan;

        System.out.printf("Enter the loan amount: ");
        loanAmount = keyboard.nextDouble();

        System.out.printf("Enter the interest rate on the loan: ");
        interestAmount = keyboard.nextDouble();

        System.out.printf("Enter the term (years) for the loan payment: ");
        termOfLoan = keyboard.nextInt();

        System.out.printf("\n======================================\n");
        keyboard.close();

        monthlyPayment = processPayment(loanAmount, interestAmount, termOfLoan);
        balance = -(monthlyPayment * (termOfLoan * 12));
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", monthlyPayment);
    }


    public static double processPayment(double loanAmount, double interestAmount, int termOfLoan) {
        // calculates the monthly payment
        double rate = (interestAmount / 100) / 12;
        double base = (1 + rate);
        double months = termOfLoan * 12;
        double result = 0.0;
        result = ((rate * loanAmount) / (1 - Math.pow(base, -months)));

        return result;
    }*/
    } // end of main

// end of class
}









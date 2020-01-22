package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//// 1.  Math Two
//        int myNumber = 2;
//        double namedMyOhterNubmer = 1.7938;
//        System.out.println("My Number = " + myNumber + "\nMy Other Number = " + namedMyOhterNubmer);
//
//
//        // 2.Your assignment.... Scanner Class next
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your details ?");
//        String firstInitial = sc.next();
//        String lastName = sc.next();
//        String houseNumber = sc.next();
//        String streetName = sc.next();
//        String streetType = sc.next();
//        String city = sc.next();
//        System.out.print(firstInitial + "\n" + lastName + "\n" + houseNumber + "\n");
//        System.out.println(streetName + "\n" + streetType + "\n" + city);
//
//
//        //3. Average Nubmers
//        int num1, num2, num3;
       Scanner keyboard = new Scanner(System.in);
//        System.out.print("First temperature? ");
//        num1 = keyboard.nextInt();
//
//        System.out.print("Second temperature? ");
//        num2 = keyboard.nextInt();
//
//        System.out.println("The average value is : " + (num1 + num2) / 2.0);


//4. Pet's name

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
    }
}




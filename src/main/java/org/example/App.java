package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true) {
            printMenu();
            switch (getInputNumber()) {
                case 1:
                    exercise.ex1();
                    break;
                case 2:
                    exercise.ex2();
                    break;
                case 3:
                    exercise.ex3();
                case 4:
                    exercise.ex4();
                    break;
               case 5:
                    exercise.ex5();
                    break;

                    case 6:
                    exercise.ex6();
                    break;
                case 7:
                    exercise.ex7();
                    break;
                case 8:
                    exercise.ex8();
                   break;
                case 9:
                    exercise.ex9();
                   break;
                case 10:
                    exercise.ex10();
                    break;
                case 11:
                    exercise.ex11();
                     break;
                case 12:
                    exercise.ex12();
                    break;
                    case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t\texercise number is not valid");
                    break;
            }


        } // while


    } // main


    public static void printMenu() {
        System.out.println("##### Arrays Exercises #####");
        System.out.print("\tExercise number (1-13): ");
    }

    public static int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\t\tenter a valid number between 1-13");
        }

        return number;
    }


} // class





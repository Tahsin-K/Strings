package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class exercise {

    public static void ex1() {
        String letters = "Java";
        System.out.println(letters.length());

    }

    public static void ex2() {

        String test = "Long example sentence";
        System.out.println(test.charAt(6));

    }

    public static void ex3() {

        String example = "Even longer example sentence";
        int index1 = example.indexOf("o");
        System.out.println(index1);
    }

    public static void ex4() {
        String example = "Ok this is not as long!";
        System.out.println(example.substring(10, 22));

    }

    public static void ex5() {
        String example = "CAPS EQUALS SCREAMING";
        example = example.toLowerCase();
        {
            System.out.println(example);
        }
        example = example.toUpperCase();
        System.out.println(example);
    }

    public static void ex6() {
        String example = "Java is the worst programming language!";
        System.out.println(example.replace("worst", "best"));
    }

    public static void ex7() {
        String example = "\tJ\ta\tv\ta\t";
        System.out.println(example.trim());
    }

    public static void ex8() {
        int i = 20;
        System.out.println("example" + " " + String.valueOf(i) + 20);
    }


    public static void ex9() {
        String Example = "oil and Water";
        String[] split = Example.split("and");
        System.out.println("Split Example:" + " " + Example + " " + Arrays.toString(split));
    }

    public static void ex10() {
        String names = "Carl,Susie,Fredrick,Bob,Erik";
        String[] persons = names.split(",");
        for (int i = 0; i < names.length(); i++) {
            System.out.println(persons[i]);
        }
    }

    public static void ex11() {
        String example = "ThisShouldBeConverted";
        char[] word = example.toCharArray();
        for (char i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }

    }

    public static void ex12(){
        char [] word = {'J','a','v','a'};
        String newWord = new String(word);
        System.out.println(newWord );
    }
}





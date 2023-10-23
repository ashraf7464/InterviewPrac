package InterviewPrep;

import org.testng.annotations.Test;

import java.util.Arrays;

public class JavaMentoring {

    @Test

    public void stringFunctions() {

        String firstString = "Batch-5";
        String secondString = "is learning Java language now";

        // Length of first string

        int length = firstString.length();
        System.out.println(length);

        // Make firstString to UpperCase

        String upperCase = firstString.toUpperCase();
        System.out.println(upperCase);

        // How to get 4th letter of firstString?

        String fourthLetter = String.valueOf(firstString.charAt(3));
        System.out.println(fourthLetter);

        // Validate that if firstString contains 5, “we are good” else “We need to check code”

        if (firstString.contains("5")) {
            System.out.println("we are good");
        } else {
            System.out.println("We need to check code");
        }

        // Validate that secondString starts with “is”

        if (secondString.startsWith("is")) {
            System.out.println("It starts with 'is'");
        } else {
            System.out.println("It does not start with 'is'");
        }

        // Validate that secondString ends with “now”

        if (secondString.endsWith("now")) {
            System.out.println("It ends with 'now'");
        } else {
            System.out.println("It does not end with 'now'");
        }

        // Concat firstString and secondString

        String newString = firstString.concat(secondString);
        System.out.println(newString);

        // Retrieve “Java” from secondString and print

        String[] words = secondString.split(" ");
        System.out.println(words[2]);


    }

    @Test
    public void stringFunctions1() {

        String email = "info@uprighttechsolutions.com";

        // Split the email by “@” and print two arrays.

        String[] splitString = email.split("@");
        System.out.println(Arrays.toString(splitString));

        //Replace the “@” with “_” and print

        String modifiedString = email.replace("@", "_");
        System.out.println(modifiedString);

        //Reverse the email using loop

        for (int i = email.length() - 1; i >= 0; i--) {
            System.out.print(email.charAt(i));

        }

        System.out.println();
        //Write palindrome code using Madam, Level, Kayak

        String str1 = "Madam";
        String str2 = "Level";
        String str3 = "Kayak";

        String reverse1 = "";
        String reverse2 = "";
        String reverse3 = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse1 = reverse1 + str1.charAt(i);
        }

        if (reverse1.equalsIgnoreCase(str1)) {
            System.out.println("Madam is a palindrome");
        } else {
            System.out.println("Madam is not a palindrome");
        }

        //•	Let Say there is a String  “ Hello Please Write a Java Program”… So how many characters here without space?

        String text = " Hello Please Write a Java Program";
        String text1 = text.replace(" ", "");
        System.out.println(text1.length());

    }

    @Test
    // Let’s Say, you are given a String. How to check if any vowel’s are there or not?

    public boolean hasVowels(String str) {

        String word = "Bangladesh";

        if (hasVowels(word)) {
            System.out.println("The string contains vowels");
            return true;
        } else {
            System.out.println("The string does not contain vowels");
            return false;
        }

    }


}
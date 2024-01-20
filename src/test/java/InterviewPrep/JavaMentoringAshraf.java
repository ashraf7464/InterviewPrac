package InterviewPrep;

import org.testng.annotations.Test;

import java.util.Locale;

public class JavaMentoringAshraf {

   /* Let take your first name “uprigttechsolutions”. Write a program that print the occurances of the each characters. Lets’s say u is displaying 2 times, t three times, p 1 time.

    Ø Let Say there is a String “ Hello Please Write a Java Program”… So how many characters here without space?

    Ø Let’s Say, you are given a String "UprightTechSolutions". How to check if any vowel’s are there or not?

    Write a program that prompts the user to input an number. . The program should
    Indicate that the number is positive or negative.*/


    @Test
    public void numberOfChar(){
        String a = " Hello Please Write a Java Program";
        String b = a.replace(" ","");
        System.out.println(b.length());
    }

    @Test
    public void hasVowels(){
        String name = "UprightTechSolutions";
        String name1 = name.toLowerCase();

        for(int i =0; i<name1.length(); i++){
            char c = name1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println(c+" is a vowels");
            } else{
                System.out.println(c+" is not a vowels");
            }
        }
    }
    @Test
    public void occarance(){

        String firstName = "uprigttechsolutions";
        int count =0;
        for(int i=0; i<firstName.length(); i++){

        }
    }



































}

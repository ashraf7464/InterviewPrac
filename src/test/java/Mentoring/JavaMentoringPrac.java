package Mentoring;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaMentoringPrac {

    @Test
    public void evenOrOdd(){
        int a =3;
        if(a%2==0){
            System.out.println(a+" is an even number");
        }
        else{
            System.out.println(a+" is not an even number");
        }
    }
    @Test
    public void sumAndAvg(){
        int[]numbers={1,2,3,7,5,6,7,8,9,11,13};
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            sum = sum+numbers[i];
        }
        System.out.println("The sum of all numbers is: "+sum);

        double avg = (double) sum/numbers.length;
        System.out.println("The avg of numbers is: "+avg);
    }
    @Test
    public void fibonacci(){
        int n1=0;
        int n2=1;
        int n=10;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=0; i<n-2; i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
    @Test
    public void evenAndOddArray(){
        int[]numbers={1,2,3,7,5,6,7,8,9,11,13};
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2==0){
                evenNumbers.add(numbers[i]);
            }
            else{
                oddNumbers.add(numbers[i]);
            }
        }
        System.out.println("These are even numbers: "+evenNumbers);
        System.out.println("These are odd numbers: "+oddNumbers);
    }
    @Test
    public void  reverseInteger(){
        int[]numbers={1,2,3,7,5,6,7,8,9,11,13};
        ArrayList<Integer> reverseNumbers = new ArrayList<>();
        for(int i=numbers.length-1; i>=0; i--){
            reverseNumbers.add(numbers[i]);
        }
        System.out.println(reverseNumbers);
    }
    @Test
    public void stringFunction1(){
        String a ="Batch-5";
        String b ="is learning Java Language now";

        // Length of String
        int lengthOfStringA = a.length();
        int lengthOfStringB = b.length();
        System.out.println(lengthOfStringA);
        System.out.println(lengthOfStringB);

        // To UpperCase
        String upperCaseA = a.toUpperCase();
        String upperCaseB = b.toUpperCase();
        System.out.println(upperCaseA);
        System.out.println(upperCaseB);

        //4th Letter of String
        String fourthLetterA = String.valueOf(a.charAt(3));
        String fourthLetterB = String.valueOf(b.charAt(3));
        System.out.println(fourthLetterA);
        System.out.println(fourthLetterB);
        char fourthA = a.charAt(3);
        char fourthB = b.charAt(3);
        System.out.println(fourthA);
        System.out.println(fourthB);

        //Validate String a has 5
        if(a.contains("5")){
            System.out.println("String a has 5");
        }
        else{
            System.out.println("String a has not 5");
        }

        // String b ends with now
        if(b.endsWith("now")){
            System.out.println("String b ends with now");
        }

        //Concat String a with b
        String c = a.concat(b);
        System.out.println(c);

        //Retrieve Java from String b
        String [] words = b.split(" ");
        for(int i=0; i<words.length; i++){
            if(words[i].equalsIgnoreCase("Java")){
                System.out.println(words[i]);
            }
        }
    }
    @Test
    public void stringFunction2(){
        String email = "info@uprighttechsolution@com";

        //Split by @ and print two arrays
        String [] splitString = email.split("@");
        System.out.println(Arrays.toString(splitString));

        //Replace @ with _ and print
        String modifiedString = email.replace("@","_");
        System.out.println(modifiedString);

        //Reverse the String
        for(int i=email.length()-1; i>=0; i--){
            System.out.print(email.charAt(i));
        }
        System.out.println();

        //Palindrome
        String palindrome = "Madam";
        String reverse ="";
        for(int i=palindrome.length()-1; i>=0; i--){
            reverse=reverse+palindrome.charAt(i);
        }
        if(reverse.equalsIgnoreCase("madam")){
            System.out.println("Madam is a palindrome");
        }
    }
    @Test
    public void hasVowels(){
        String country = "Bangladesh";
        int count=0;
        for(int i=0; i<country.length(); i++){
            char c = country.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println(c+ " is a vowels");
                count++;
            }
        }
        System.out.println("Number of vowels present: "+count);
    }
    @Test
    public void hasVowels1() {
        String country = "Bangladesh";
        boolean hasvowels = false;
        for (int i = 0; i < country.length(); i++) {
            char c = country.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                hasvowels = true;
            }else{
                hasvowels = false;
            }
        }
        System.out.println(hasvowels);
    }






























}

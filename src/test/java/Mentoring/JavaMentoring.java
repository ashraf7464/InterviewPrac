package Mentoring;

import org.testng.annotations.Test;

import java.util.*;

public class JavaMentoring {


    @Test
    public void evenAndOdd(){

        int a = 3;

        if(a%2==0){
            System.out.println("this is an even number");
        } else {
            System.out.println("this is an odd number");
        }
    }

    @Test
    public void sumAndAvg(){

        int a1=1, a2=2, a3=3, a4=4, a5=6;

        int sum = a1+a2+a3+a4+a5;
        System.out.println(sum);

        double avg = (double) sum/5;
        System.out.println(avg);
    }

    @Test
    public void fibonacci(){
        int a1=0;
        int a2=1;
        int n =10; // Total 10 numbers in the sequence
        System.out.println(a1);
        System.out.println(a2);
        for(int i=1; i<=n-2; i++){
            int a3=a1+a2;
            a1=a2;
            a2=a3;
            System.out.println(a3);
        }
    }

    @Test
    public void evenAndOddArray(){
        int [] numbers = {1,2,3,4,5,6,7,8,9};
        for(int i =0; i<numbers.length; i++){
            if(numbers[i]%2==0){
                System.out.println(numbers[i]+" this is an even number");
            } else{
                System.out.println(numbers[i]+" this is an odd number");
            }
        }
    }

    @Test
    public void sumAndAvgArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum=0;
        for(int i =0; i<numbers.length; i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);

        double avg = (double) sum/numbers.length;
        System.out.println(avg);
    }

    @Test
    public void reverseInteger() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> reverseNumber = new ArrayList<>();
        for(int i=numbers.length-1; i>=0; i--){
            //System.out.println(numbers[i]);
            reverseNumber.add(numbers[i]);
        }
        System.out.println(reverseNumber);
    }

    @Test
    public void stringFunction(){

        String firstString = "Batch-5";
        String secondString = "is learning Java language now";

        // Length of String

        int lengthOfFirstString = firstString.length();
        System.out.println(lengthOfFirstString);

        // To Upper Case

        String upperCase = firstString.toUpperCase();
        String upperCase2 = secondString.toUpperCase();

        System.out.println(upperCase);
        System.out.println(upperCase2);

        // 4th Letter of String

        String fourthLtr = String.valueOf(firstString.charAt(3));
        String fourthLtr1 = String.valueOf(secondString.charAt(3));
        System.out.println(fourthLtr);
        System.out.println(fourthLtr1);

        // Validate first string contains 5

        if(firstString.contains("5")){
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }

        // Validate 2nd string starts with is

        if(secondString.startsWith("is")){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Validate 2nd string ends with now

        if(secondString.endsWith("now")){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Concat Strings

        String concatinatedString = firstString.concat(" "+secondString);
        System.out.println(concatinatedString);

        // Retrive Java from second string

        String [] words = secondString.split(" ");
        //System.out.println(words[2]);

        for(int i =0; i<words.length; i++){
            if(words[i].equalsIgnoreCase("Jva")){
                System.out.println(words[i]);
            }
        }

    }

    @Test
    public void stringFunction2(){
        String email = "info@uprighttechsolution.com";

        // Split by '@' and print in Array
        String [] splitString = email.split("@");
        System.out.println(Arrays.toString(splitString));

        // Replace @ with #

        String newString = email.replace("@", "#");
        System.out.println(newString);

        // reverse String with loop

        for(int i=email.length()-1; i>=0; i--){
            System.out.print(email.charAt(i));
        }

        System.out.println();
        // Palindrome with Madam

        String str = "Madam";
        String reverse ="";

        for(int i =str.length()-1; i>=0; i--){
            reverse = reverse+str.charAt(i);
        }
        if(reverse.equalsIgnoreCase("madam")){
            System.out.println("this is a palindrome");
        } else{
            System.out.println("Not a palindrome");
        }
    }

    @Test
    public void stringFunction3() {
        String text = " Hello! Please, write a Java program";

        String text1 = text.replace(" ", "");

        System.out.println(text1.length());

    // Remove duplicate from list
        int[] numbers = {1, 2, 3, 4, 5, 6, 6, 7, 2, 7, 8, 9};

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++){
            set.add(numbers[i]);
        }

        System.out.println(set);
    }

    // Validate vowels are there in a String
    @Test
    public void hasVowels(){

        String country = "Bangladesh";

        boolean hasVowels = false;

        for(int i =0; i<country.length(); i++) {
            char c = country.charAt(i);
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                hasVowels=true;
                break;
            }
        }
        if(hasVowels){
            System.out.println("String has vowels");
        }
        else{
            System.out.println("No Vowels");
        }
    }

    @Test
    public void totalVowels(){
        String country = "Bangladesh";
        int count=0;
        for(int i=0; i<country.length(); i++){
            //System.out.println(country.charAt(i));
            char c = country.charAt(i);
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                System.out.println(c);
                count++;
            }
        }
        System.out.println("Total number of Vowels: "+ count);
    }



















}

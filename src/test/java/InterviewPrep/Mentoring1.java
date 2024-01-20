package InterviewPrep;

import java.util.Scanner;

public class Mentoring1 {

    public static void inputNumber(){

        //Write a program that prompts the user to input an number. . The program should
        //    Indicate that the number is positive or negative.

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        int number = sc.nextInt();

        if(number>=0){
            System.out.println(number+" is positive");
        } else{
            System.out.println(number+" is negative");
        }
    }

    public static void main(String[] args) {
        inputNumber();
    }
}

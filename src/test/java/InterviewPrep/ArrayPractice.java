package InterviewPrep;

import org.testng.annotations.Test;

import java.util.*;

public class ArrayPractice {

    int [] a = {20, 30, 35, 60};

    @Test
    public void arrayDemo(){

        int [] numbers = { 2,3,4,5,6,7,9};

        for(int i=0; i<numbers.length; i++) {
            //System.out.println(numbers[i]);

            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is a even number");
            } else if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i] + " is a odd number");
            }

        }
    }

    @Test
    public void arrayList(){

        int [] num = {100, 200, 300, 400, 500};

        List<Integer> num1 = new ArrayList<>();
        num1.add(100);
        num1.add(200);
        num1.add(300);
        num1.add(400);
        num1.add(500);

        for(int i=0; i<num1.size(); i++){
            System.out.println("The index is: "+i);
            System.out.println("The numbers are: "+num1.get(i));
        }

        num1.add(200);

        System.out.println(num1);

        Set<Integer> set = new HashSet<>(num1);
        System.out.println(set);

        // Validate 400 is there in the Set
        int value = 400;
        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
            int element = iterator.next();
            if(element==value){
                System.out.println("Found "+value);
                break;
            }
        }
        // OR
        boolean number = set.contains(400);
        if(number==true){
            System.out.println("400 value is there");
        }
        else{
            System.out.println("400 is not there");
        }

        //OR
        for(int m:set){
            if(m==400){
                System.out.println("400 value is there");
                break;
            }
            else{
                System.out.println("400 is not there");

            }
        }
    }
}

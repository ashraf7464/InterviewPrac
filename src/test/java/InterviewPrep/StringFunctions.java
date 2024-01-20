package InterviewPrep;

import org.testng.annotations.Test;

import java.util.Arrays;

public class StringFunctions {

/*
1. UpperCase/LowerCase
2. Split String
3. String to Integer vice versa
4. Reverse String with loop
5. subString
6. Concat
7. replace
8. Palindrome
9. PyramidShape
10. Fibonacci
 */

@Test
    public void upperCase(){
    String name = "Md Ashraf Siddique";
    String upperCaseName = name.toUpperCase();
    System.out.println(upperCaseName);
}

@Test
    public void lowerCase(){
    String name = "Md Ashraf Siddique";
    String lowerCaseName = name.toLowerCase();
    System.out.println(lowerCaseName);
}

@Test
    public void splitString(){
    String name = "Md Ashraf Siddique";
    String [] splitWords = name.split(" ");
    System.out.println(splitWords[0]);

    System.out.println(Arrays.toString(splitWords)); // to print an array

    String [] splitWords1 = name.split(" ",2);
    System.out.println(Arrays.toString(splitWords1));
}

@Test
    public void stringToInteger(){
    String money = "100";
    System.out.println(money+200);
    int money1 = Integer.parseInt(money);
    System.out.println(money1);

    System.out.println(money1+300);
}

@Test
    public void integerToString(){
    int money = 100;
    System.out.println(money+"200");
    String money1 = String.valueOf(money);
    System.out.println(money1);

    System.out.println(300+money1);
}
@Test
    public void reverseStringWithLoop(){
    String name = "Md Ashraf Siddique";
    String reverseName= "";
    for(int i=name.length()-1; i>=0; i--){
        reverseName=reverseName+name.charAt(i);
    }
    System.out.println(reverseName);
}

@Test
    public void reverseStringWithLoop1(){
    String name = "Md Ashraf Siddique";

    for(int i=name.length()-1; i>=0; i--){
        System.out.print(name.charAt(i)); //print not println
    }
}

@Test public void subString(){
    String name = "Md Ashraf Siddique";
    String newName = name.substring(3,9);
    System.out.println(newName);
}

@Test
    public void stringConcatenation(){
    String name1 = "Md Ashraf";
    String name2 = " Siddique";
    String newName = name1.concat(name2);
    System.out.println(newName);
}
@Test
    public void replace(){
    String email = "ashraf#gmail.com";
    String newEmail = email.replace("#","@");
    System.out.println(newEmail);
}

@Test
    public void palindrome(){
    String str = "madam";
    String reverseStr = "";

    for(int i=str.length()-1; i>=0; i--){
        reverseStr= reverseStr+str.charAt(i);
    }
    System.out.println(reverseStr);

    if(str.equals(reverseStr)){
        System.out.println("This is palindrome");
    }
    else{
        System.out.println("This is not palindrome");
    }
}

@Test
    public void pyramid(){

    int rows = 10;

    for(int i=0; i<=rows; i++){
        for(int j =0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}


@Test
    public void reversePyramid(){
    int rows = 0;

    for(int i=10; i>=rows; i--){
        for(int j =0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

@Test
    public void fibonacci(){
    int n =10;
    int n1 = 0;
    int n2 = 1;
    System.out.println(n1);
    for(int i=0; i<n; i++){
        int sum = n1+n2;
        n1=n2;
        n2=sum;
        System.out.println(sum);
    }

}


}

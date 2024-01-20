package StringPractice;

import org.junit.Test;

public class StringFunctions {
     /*
    1. UpperCase/LowerCase
    2. Split String
    3. String to Integer vice versa **
    4. Reverse String with loop **
    5. subString
    6. Concat **
    7. replace
    8. Palindrome **
    9. PyramidShape **
    10. Fibonacci
     */


@Test
    public void stringToInteger(){

    String money = "100";
    //System.out.println(money+100);
    int money1 = Integer.parseInt(money);
    //System.out.println(money1);
    System.out.println(100+money1);
}

@Test
    public void integerToString(){

    int money = 100;
    //System.out.println(money+100);
    String money1 = String.valueOf(money);
    //System.out.println(money1);
    System.out.println(100+money1);
}

@Test
    public void reverseStringWithLoop(){

    String name = "Md Ashraf Siddique";

    //System.out.println(name.length());

    String reverseName = "";

    for(int i =name.length()-1; i>=0; i--){
        reverseName= reverseName+name.charAt(i);
    }
    System.out.println(reverseName);
}


@Test
public void reverseStringWithLoop1(){

    String name = "Md Ashraf Siddique";

    for(int i =name.length()-1; i>=0; i--){
        System.out.print(name.charAt(i));
    }

}

@Test
    public void stringConcatenation(){

    String a = "Md Ashraf";
    String b = " Siddique";
    String c = " Khan";

    String newString = a.concat(b);
    String newString1 = a.concat(b.concat(c));
    System.out.println(newString);
    System.out.println(newString1);
}

@Test
    public void palindrome(){

    String word = "kayak"; //madam

    String reverseWord = "";

    for(int i= word.length()-1; i>=0; i--){

        reverseWord= reverseWord+word.charAt(i);
    }
    System.out.println(reverseWord);

    if(word.equals(reverseWord)){
        System.out.println("This is a palindrome");
    }
    else{
        System.out.println("This is not a palindrome");
    }
}

@Test
    public void pyramid(){

    int rows =10;

    for(int i=1; i<=rows; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

}

    @Test
    public void reversePyramid(){

        int rows =0;

        for(int i=10; i>=rows; i--){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

@Test
    public void fibonacci(){

    int n = 10;
    int n1=0;
    int n2=1;
    System.out.println(n1);

    for(int i=0; i<n-1; i++){
        int sum = n1+n2;
        n1=n2;
        n2=sum;
        System.out.println(sum);
    }

}









}

package InterviewPrep;

import org.testng.annotations.Test;

import java.util.Arrays;

public class StringBuilderBuffer {

    public static void main(String[] args) {


    }

    /* String Buffer and String Builder are two classes used for String manipulations.
    Append, Insert, replace, Delete, Reverse, to String
     */
@Test
    public static void append(){

        StringBuilder sb = new StringBuilder("Ashraf");
        sb.append(" Siddique");
        System.out.println(sb);
        sb.append(" Rahul"+" Khan");
    System.out.println(sb);
    }
@Test
    public void insert(){
    StringBuffer sb = new StringBuffer("Ashraf");
    sb.insert(0,"Md ");
    System.out.println(sb);
    sb.insert(9," Siddique");
    System.out.println(sb);
}

@Test
    public void replace(){
    StringBuilder sb = new StringBuilder("Md Ashraf Siddique");
    sb.replace(3,9,"Asif");
    System.out.println(sb);
}
@Test
    public void delete(){
    StringBuilder sb = new StringBuilder("Md Ash5677raf Sidd888ique");
    sb.delete(6,10); // initial value is from where it starts and end value is +1 to where it should ends
    System.out.println(sb);
    sb.delete(14,17);
    System.out.println(sb);
}

@Test
    public void reverse(){
    StringBuilder sb = new StringBuilder("Md Ashraf Siddique");
    sb.reverse();
    System.out.println(sb);
}

@Test
public void reverseWords(){
    String name = "My Name Is Ashraf";
    String [] words = name.split(" ");
    System.out.println(Arrays.toString(words));

    StringBuilder reverseString = new StringBuilder();
    for(int i= words.length-1; i>=0; i--){
        reverseString.append(words[i]);
        if(i!=0){
            reverseString.append(" ");
        }
    }
    System.out.println(reverseString.toString());
}

@Test
    public void toStringMethod(){  // To convert StringBuilder object to String
    String [] words = {"Are", "You", "A", "Programmer"};
    StringBuilder sb = new StringBuilder();
    sb.append(words[0]);
    sb.append(" " + words[1]);
    sb.append(" " + words[2]);
    sb.append(" " + words[3]);

    String str = sb.toString();
    System.out.println(str);
    System.out.println(sb);

}



}

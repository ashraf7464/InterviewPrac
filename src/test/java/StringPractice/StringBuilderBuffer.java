package StringPractice;

import org.junit.Test;

import java.util.Arrays;

public class StringBuilderBuffer {

    /* String Buffer and String Builder are two classes used for String manipulations.
    Append, Insert, replace, Delete, Reverse, toString
*/

    @Test
    public void append(){

        StringBuilder sb = new StringBuilder("Ashraf");
        sb.append(" Siddique");
        sb.append(" Khan");
        System.out.println(sb);

    }

    @Test
    public void insert(){
        StringBuilder sb = new StringBuilder("Ashraf");
        sb.insert(0,"Md ");
        System.out.println(sb);
        sb.insert(3, "Asif ");
        System.out.println(sb);

    }

    @Test
    public void replace(){
        StringBuilder sb = new StringBuilder("Md Ashraf Siddique");
        sb.replace(3, 9,"Asif");
        System.out.println(sb);
    }

    @Test
    public void delete(){
        StringBuffer sb = new StringBuffer("Md Ash4444raf Siddi88888que");
        sb.delete(6,10);
        System.out.println(sb);
        sb.delete(15, 20);
        System.out.println(sb);
    }

    @Test
    public void reverse(){
        StringBuilder sb = new StringBuilder("Md Ashraf Siddique");
        sb.reverse();
        System.out.println(sb);
    }

    @Test
    public void toString1(){
        StringBuilder sb = new StringBuilder("Md Ashraf Siddique");
        System.out.println(sb);
        System.out.println(sb.toString());


    }

    @Test
            public void toString2(){

    String name = "Md Ashraf Siddique";
    String [] words = name.split(" ");

    System.out.println(Arrays.toString(words));

    }

    @Test
    public void reverseOnlyWord(){
        String name = "My Name Is Ashraf";
        String [] words = name.split(" ");
        //System.out.println(Arrays.toString(words));

        StringBuilder reverseWord = new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
           reverseWord.append(words[i]);  //Ashraf
           if(i!=0){
               reverseWord.append(" "); // " "
           }
        }

        System.out.println(reverseWord.toString());

    }














}

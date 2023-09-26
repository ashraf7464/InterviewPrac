import org.testng.annotations.Test;

import java.util.*;

public class Practice2 extends BaseClass{



@Test
    public void fibonacci(){

        int n=10;
        int n1=0;
        int n2=1;

        System.out.print(n1+" "+n2);

        for(int i=1; i<=n-2; i++){
            int sum= n1+n2;
            n1=n2;
            n2=sum;
            System.out.print(" "+sum);
        }
    }

    @Test

    public void sumAndAvg(){

    int a1=1, a2=2, a3=3, a4=4, a5=5;

    int sum = a1+a2+a3+a4+a5;
    System.out.println(sum);

    double avg = (double) sum/5;
    System.out.println(avg);

    }

    @Test

    public void sumAndAng1(){

    int[] numbers = {1,2,3,4,5};

    int sum =0;

    for(int i=0; i<numbers.length; i++){
        sum = sum+numbers[i];
    }
    System.out.println(sum);
        double avg = (double) sum/numbers.length;
        System.out.println(avg);

    }
@Test
    public void reverseInteger(){

        int[] numbers = {1,2,3,4,5,6,7,8};

        for(int i=numbers.length-1; i>=0; i--){
            System.out.println(numbers[i]);
        }

    }

@Test
    public void evenAndOdd(){

    int[] numbers = {1,2,3,4,5,6,7,8};
    List<Integer> evenNumbers = new ArrayList<>();
    List<Integer> oddNumbers = new ArrayList<>();

    for(int i=0; i<numbers.length; i++){
        if(numbers[i]%2==0){
            System.out.println(numbers[i]+" is an even number");
            evenNumbers.add(numbers[i]);
        }else{
            System.out.println(numbers[i]+" is an odd number");
            oddNumbers.add(numbers[i]);
        }
    }
    System.out.println("************************");
    System.out.println(evenNumbers);
    System.out.println(oddNumbers);
}

@Test

public void hashmap(){

    HashMap<Integer, String> hm = new HashMap<>();

    hm.put(1,"Ashraf");
    hm.put(2, "Joya");
    hm.put(3, "Rabin");

    hm.forEach((key,value)->System.out.println(key+" "+value));

    for(Map.Entry<Integer,String> data: hm.entrySet()){
        System.out.println(data.getKey()+ "---"+ data.getValue());

    }


}

@Test
    public void hashmap2(){

    HashMap<Integer, String> hm = new HashMap<>();

    hm.put(1,"Ashraf");
    hm.put(2, "Joya");
    hm.put(3, "Rabin");

    Iterator<Map.Entry<Integer, String> > itr= hm.entrySet().iterator();
    while(itr.hasNext())
    {
        Map.Entry<Integer, String> data=(Map.Entry<Integer, String>)itr.next();
        System.out.println(data.getKey()+"---"+data.getValue());
    }

}

@Test

public void reverseString(){

    String myName = "ashraf";

    for(int i=myName.length()-1; i>=0; i-- ){
        System.out.print(myName.charAt(i));
    }
}






















    public static void main(String[] args) {

        driverInit();
    }
}

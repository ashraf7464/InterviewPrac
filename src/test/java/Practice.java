import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Practice extends BaseClass{


    // Print out Fibonacci Seq upto 10
@Test
    public static void fibonacci(){

        int n=10;
        int n1=0;
        int n2=1;

        System.out.println(n1);
        System.out.println(n2);
        for(int i=0; i<n-2; i++){
            int sum = n1+n2;
            n1=n2;
            n2=sum;
            System.out.println(sum);
        }

    }
@Test
    public static void pyramidShape(){
        int rows =10;

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
@Test
    public static void reversePyramidShape(){

        int rows =0;
        for(int i=10; i>=rows; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
@Test
    //select xbox from search dropdown in Amazon
    public static void dynamicSelect() throws InterruptedException {
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("tan");

        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));

        for(WebElement option: options){
            if(option.getText().equalsIgnoreCase("Tajikistan")){
                option.click();
            }
        }

    }
@Test
    // Print all names of an array
    public static void arrayPractice(){

        String [] name = {"Ashraf", "Bushra", "Tashrif", "Delwar"};

        for(int i =0; i<name.length; i++){
            System.out.println(name[i]);
        }
    }
@Test
    // sort out even and odd numbers
    public static void evenAndOddNumbers(){

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2 ==0){
                //System.out.println(numbers[i]+" is an Even Number");
                evenNumbers.add(numbers[i]);
            }
            else{
                //System.out.println(numbers[i]+" is an Odd Number");
                oddNumbers.add(numbers[i]);
            }
        }
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);

    }

    public static void main(String[] args) throws InterruptedException {

        driverInit();
        dynamicSelect();
    }

}

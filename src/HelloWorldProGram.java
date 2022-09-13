import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorldProGram {
    public static void main(String args[]){
//        int num1,num2;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter First Number");
//        num1 = sc.nextInt();
//        System.out.println("Enter Second Number");
//        num2 = sc.nextInt();
//
//        if(num1 > num2){
//            System.out.println("The greater Number is "+ num1);
//        }
//
//        else{
//            System.out.println("The greater Number is "+ num2);
//        }
        System.out.println("Enter Year: ");
        int year;
        year = sc.nextInt();

        if((year % 4 == 0)  && ((year % 100 != 0) || (year% 400 == 0))){
            System.out.println("The Year "+year+" is a leap year");
        }else{
            System.out.println("The Year "+year+" is not a leap year");
        }
        
    }
}
// int ,float, byte, short, boolean, double, long, char
// variable named memory location
// float 32bit
//double 64 bit
// Scanner class
// conditional statements
// if else
//  nested if and if else ladder
// and or not
//
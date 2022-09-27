package model;
import java.util.List;
public class Operator {
    static int addition(List <Integer> numbers){
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
    static int subtract(List <Integer> numbers){
        int sum = numbers.get(0);
        for(int i = 1;i < numbers.size();i++){
            sum -= numbers.get(i);
        }
        return sum;
    }
    static int multiply(List <Integer> numbers){
        int sum = numbers.get(0);
        for(int i = 1;i < numbers.size();i++){
            sum *= numbers.get(i);
        }
        return sum;
    }
    static double division(double a, double b){
        return a / b;
    }
    static int modulus(int a, int b){
        return a % b;
    }
   static void biggerThan (int a, int b){
        boolean bool = a > b;
        if (bool){
            System.out.println(a + " är större än " + b + ".");
        }else {
            System.out.println(a + " är inte större än " + b + ".");
        }
    }
    static void smallerThan (int a, int b) {
        boolean bool = a < b;
        if (bool) {
            System.out.println(a + " är mindre än " + b + ".");
        } else {
            System.out.println(a + " är inte mindre än " + b + ".");
        }
    }
}

/**
 * Created by smita on 7/14/17.
 *
 * A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
 * A class named Adder that inherits from a superclass named Arithmetic.
 *
 */

public class Inheritance2 {
    public static void main(String[] args){
        Adder adder= new Adder();
        System.out.println(adder.add(2,3));
    }
}

class Arithmetic{
    int add(int num1, int num2){
        return num1+num2;
    }
}

class Adder extends Arithmetic{}

/**
 * Created by smita on 7/14/17.
 *
 * Consider Animal class with method walk(this method will just display some text).
 * Consider bird class which has extended Animal class. Bird class has two methods: fly and sing.
 * Create a object of bird class and call walk, fly and sing methods.
 *
 */
public class Inheritance1 {
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }

    void sing(){
        System.out.println("I am singing");
    }
}

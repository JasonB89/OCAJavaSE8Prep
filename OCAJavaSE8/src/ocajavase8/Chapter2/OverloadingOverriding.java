/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8.Chapter2;
/**
 * Jason.blood
 */
public class OverloadingOverriding {
    
    public int add(int x, int y){       // creating a public add which takes two ints and returns one 
        
     return x + y;   
    }
    
    public double add(double x, double y){  // overridding add method to take doubles instead of ints
        
     return x + y;   
    }
    
    public long add(long x, long y){
    
        return x + y;
    }
    
    public void testCar(Car c){         // method that takes in a car object
    
        System.out.println("i am a car");
    }
    
}

class Overrider extends OverloadingOverriding{

    public String add(String x, String y){ // overridding/overloading add method from OverloadingOverriding class
    
        return x + y;
    }
    
    
    @java.lang.Override
    public int add(int x, int y){       // overriding add method from OverloadingOverriding
    
        return 4;
    }
    public static void main(String[] args) {
        
        Car c = new Nissian();          // Car referance veriable pointing to a Nissian object
        
        Nissian n = new Nissian();
        
        Overrider o = new Overrider();
        
        o.testCar(c);                   // even though c is a Nissian object during runtime - prints OverloadingOverride version
                                        //because the reference veriable passed into the argument list is of type animal
        o.testCar(n);                   // Nissian object passed into testCar method - prints Override version
        
        Animal ah = new Horse();
        
        ah.eat();                       // because at runtime the ah veriable will is a horse the output will be taken from the horse class
        
        Animal hor = new Horse();   // Horse can be converted to Animal because Horse is an Animal
        
//        Horse a = new Animal();   // Animal can't be converted to a horse because an animal isn't a horse 
        
        Horse h = new Horse();
        
        h.eat("Pears");             // uses the overloaded version because a string is passed into the method
        
//        hor.eat("Pears");         // won't work because even though the object will be a horse at runtime the compiler won't let it run
                                    // because it only see's Animal's eat methon which doesn't take a string
        
        if(hor instanceof Horse){
            
            Horse r = (Horse) hor;  // down casting to a more specific class, telling the compiler that we know this is of type Horse 
            r.eat("Pears");
        }
    }
    
    public void testCar(Nissian n){     // overloading test car method from OverloadingOverriding class
    
        System.out.println("i am a nissian");
    }
}
class Animal{

    public void eat(){
    
        System.out.println("Animal is eating!");
    }
}

class Horse extends Animal{

    @java.lang.Override
    public void eat(){
    
        System.out.println("Horse is eating");
    }
    
    public void eat(String s){
    
        System.out.println("Horse is eating " + s);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8.Chapter2;
/**
 * Jason.blood
 */
public class InheratanClass {
    
    public static void main(String[] args) {
        Nissian n = new Nissian();
        
        Car m = (Car)n;     // n is a type of Car therefor can be cast and assigned to a new referance veriable as a Car
        
        Nissian n2 =(Nissian)m;
        
        Car c = new Car();
        
        Car c2 = new Nissian();
        
//        Nissian n3 = (Nissian)c;        // This wil cause a class cast exception because c was never a Nissian and Car is a parent class
                                        // to Nissian so a car is not a nissian but a nissian is a car
        
        n.doStuff();        // doStuff was inherited from Vehicle
        n.beepHorn();       // beepHorn was inherited from Beepable interface and implemented by Vehicle
        n.openBoot();       // openBoot was inherited from Car
        n.doSomething();    // doSomething is a method from nissian itself
        n.badge();          // badge was called through a has a relationship with NissianBadge
        
//        m.badge();        // since n was cast as a car and stored in referance veiable m it can't use the badge method that was created in Nissian
        n2.badge();         // since m was recast to a nissian it regained access to the badge method
        
        System.out.println(n2); // 
        System.out.println(n);  // all three referance veriables are referancing the same address in memory
        System.out.println(m);  //
        
        Nissian b = (Nissian)c2;
        
        b.openBoot();
    }
    
}

abstract class Vehicle implements Beepable{      // abstract superclass Vehicle implements beepable

    @java.lang.Override
    public void beepHorn(){                     // Vehicle provides an impementation for beepHorn method from beepable interface 
    
        System.out.println("BEEP!!");
    }
    
    public void doStuff(){                      // Vehicle adds its own method
    
        System.out.println("I'm a vehicle");
    }
}

class Car extends Vehicle{                      // Car inherites beepHorn and doStuff from it's parent class (Superclass) Vehicle 

    public void openBoot(){                     // Car adds its own method
    
        System.out.println("I'm a car");
    }
}

class Nissian extends Car{                      // Nissian extends Car and inherites everything from Beepable, Vehicle and Car
                                                // Note this is because none of the methods in these classes are private and 
                                                // they're all inside the same package
    
    NissianBadge nB = new NissianBadge();       // Nissian has an instance of NissianBadge 
    
    public void badge(){                        // Nissian creates a method to call the has badge method from NissianBadge
    
        nB.hasBadge();
    }
    
    public void doSomething(){                  // Nissian has added a method for itself
        
        System.out.println("I'm a Nissian");
    }
}

interface Beepable{                             // interface that can be reused if neccessary

    void beepHorn();                            // contract that tells the next concrete class they must implement this method
}

class NissianBadge{                             //

    public void hasBadge(){
    
        System.out.println("I have a Nissian Badge");
    }
}
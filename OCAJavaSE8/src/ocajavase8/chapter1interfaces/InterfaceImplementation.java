/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8.chapter1interfaces;

/**
 *
 * @author jason.blood
 */
public class InterfaceImplementation extends TestAbClass implements PubInterface{
    
    @Override
    public void b(){};      //all methods declared in the interface must be overridden if no default implementation is given
//    int j(){return 4;}; // access modifier cannot be more restrictive mucst be public
    @Override
    public int j() { return 2; };
    
    public void abstractMedCall(){
    
        med();              // calls inherited med method 
        med2();             // calls inherited med 2 method
    }
}


class MethodInherit extends InterfaceImplementation implements PubInterface{

    // override of the interface methods isn't neccessary since they are inherited from InterfaceImplementation class
}

abstract class TestDef implements DefInterface{ // abstract class doesn't need to implament methods from the interface

    abstract void med2();                       //abstract method created in the abstract class must be implemented by the nex non-abstract child class 
}

class TestAbClass extends TestDef{      //class that extends an abstract class which implamented an iterface must provide an override for the methods
                                        //in the interface if the abstract class hasn't provided one
    
    @Override
    public void med(){System.out.println("I'm an implementation of the med method from DefInterface");};                // implemeting the method fro the interface
    
    @Override
    void med2(){System.out.println("I'm an implementation of the med2 method from the abstract class TestDef");};                      // implementing the abstract method from the abstract class
}


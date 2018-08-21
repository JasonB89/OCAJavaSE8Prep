/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8;
/**
 * Jason.blood
 */
import ocajavase8.chapter1.*;
import ocajavase8.chapter1interfaces.*;

public class OCAJavaSE8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AccessModifiersAndKeywords x = new AccessModifiersAndKeywords();
        TestAccess y = new TestAccess();
        AccessInheritTestAccess aITA = new AccessInheritTestAccess();
        InheritanceTest inTest = new InheritanceTest();
        ocajavase8.chapter1.TestInheritance testIn = new ocajavase8.chapter1.TestInheritance();
        InterfaceImplementation inImp = new InterfaceImplementation();
        
        System.out.println("accessing a public static veriable directly");
        System.out.println(AccessModifiersAndKeywords._publicInt);  // accessing a static instance veriable directly
        
        System.out.println("\naccessing a public static final class veriable directly \"constant\"");
        System.out.println(AccessInheritTestAccess.FINAL_BOOL);     // accessing a final static instance veriable directly
        
        System.out.println("\naccessing a public instance veriable through object referance");
        System.out.println(x.pubShort);                             // calling a non-static public instance veriable through an object referance
        
        System.out.println("\naccessing protected method from same package");
        aITA.testInheritance();                                     // accessing protected method through object referecne
        
        System.out.println("\ncalling a public method from another package through object reference");
        y.AccessTestMethod();                                       // calling a non-static method through and object referance
        
        System.out.println("\nMethod calling a protected method from another package through inheritance");
        inTest.checkInheritance();                                  // calling public method through an object reference
        
//        testIn.testInherit();                                     // cannot access protected method through object reference
        
//      Inheritance inher = new Inheritance();  //Inheritance class is default and in another package so can't be seen outside the package it's in
        
        testIn.pubShort = 5123;
        
        inImp.abstractMedCall();
        
        
        
        
    }
    
}
class AccessInheritTestAccess extends AccessModifiersAndKeywords{

    protected void testInheritance(){
    
        System.out.println(proObject);              // accessing protected referance veriables through inheritance
        System.out.println($ProtectFloat);          // accessing protected instance veriables through inheritance
    }
    
}

class InheritanceTest extends TestInheritance{

    public void checkInheritance(){
    
        testInherit();
    }
}
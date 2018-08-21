/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8.chapter1;
/**
 * Jason.blood
 */
public class TestAccess {
    
AccessModifiersAndKeywords accessTest = new AccessModifiersAndKeywords();   //creating an object reference veriable initialising and assigning it
    
    public void AccessTestMethod() {
        
        System.out.println(accessTest);                             // will print the memory address
        System.out.println(AccessModifiersAndKeywords._publicInt);  // accessing public static member directly
        System.out.println(AccessModifiersAndKeywords.statLong);    // accessing a default static instance veriable directly
        System.out.println(accessTest.$ProtectFloat);               // accessing a protected float trough an object referance
        System.out.println(accessTest.defSring);                    // accessing a default string object through an object reference 
        System.out.println(accessTest.defaultDub);                  // accessing a default instance veriable through an object reference 
        System.out.println(accessTest.proObject);                   // accessing a protected object through an object reference 
        System.out.println(accessTest.pubShort);                    // accessing a public instance veriable through an object reference 
    }
}

class Inheritance extends AccessModifiersAndKeywords{
  
    public void getVeriables(){
        
       Inheritance._publicInt = 5;                  // Inheritance class has access to the public static class veriable
       Inheritance.statLong = 7;                    // Inheritance class has access to the public static class veriable
       Inheritance.proByte = 10;
       
       Inheritance inherit = new Inheritance();
        
        inherit.defaultDub = 3.0;                   // accessing default instance veriable through object reference and inheritance
        inherit.$ProtectFloat = 4.0F;               // accessing protected instance veriable through object reference and inheritance
    }
}

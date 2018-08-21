/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8.chapter1;
/**
 * Jason.blood
 */
public class TestInheritance extends Inheritance{
    
    protected void testInherit(){
    
        getVeriables();                     // accessing public method through inheritance
        System.out.println(defaultDub);     // accessing default veriable through inheritance 
        System.out.println(defSring);       // accessing default object through inheritance
        System.out.println(statLong);       // accessing static veriable through inheritance
        System.out.println($ProtectFloat);  // accessing non-static protected instance veriable through inheritance
        System.out.println(proByte);        // accessing static class veriable through inheritance
    }
}

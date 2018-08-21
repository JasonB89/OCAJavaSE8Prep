/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8.chapter1interfaces;
/**
 * Jason.blood
 */
public abstract interface PubInterface {        // interfaces are abstract by default 
    
    public static final int x = 3;              // veriables in an interfce are public static and final by default
//  protected static final int y = 5;           // protected modifier not allowed
//    private static final int z = 9;           // private access modifier not allow
    int a = 4;                                  // same as public static final int 
    
    void b();                                   // abstract by default no implementation allowed public by default
    int j();
    public default void c(){};                  // still public without access modifier default in not an access modifier it is a default implementation
    default int d(){return 4;};                 // same as public default int
    static double e(){return 4.0;};             // must have a method body if static
//    default static void f(){;}                // methods cannot be static and default
//    int e(){};                                // body not allowed if default or static isn't present
    
    
}

interface DefInterface{

    void med();
}

interface ExInterface extends DefInterface, PubInterface{ // interfaces can extend multiple interfaces

}

class ImplamentClass implements DefInterface, ExInterface{ // classes can implement multiple interfaces


    public void b(){};
    public int j(){return 4;};                              // concreate class must create implementations for the abstract methods in each 
    public void med(){};                                    // interface it implaments
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8.chapter1;
/**
 * Jason.blood
 */
public strictfp class AccessModifiersAndKeywords { // strictfp is used for floating point number convention IEEE 745 standard
 
    public static int _publicInt;   // public static instance veriable public access modifier can be accessed fro anywhere
                                    // identifiers can start with an '_', currency symbol or letter. after first character numbers can ber used also
    protected float $ProtectFloat;  // protected float instance veriable, protected access modifier can be accessed within the same package and outside
                                    // the package through inheratance
    double defaultDub;              // default instance veriable, the default access modifier (No Modifier) is package private
    
    static final private  char private_$1char = 'A';   // private instance veriable, private access modifiers can only be accessed by the same class
    
    String defSring;                // default object reference veriable, object reference variables are pointers used as a signpost for objects in the stringpool or on the heap
    
    protected Object proObject;     // protected object reference veriable declaration,
    
    public short pubShort;          // public instance veriable public access modifier can be accessed fro anywhere
    
    static long statLong;           // static default instance veriable allows dereict access instead of having to use an object reference
    
    protected static byte proByte;  // protected static instance veriable
    
    public static final boolean FINAL_BOOL = true; // a static final class veriable is considered a "constant" so the convention is all caps with an underscore seperating th words
    
    
//    abstract void newMed();       // abstract method cannot be inside a non-abstract class
    static {for (int i = 0; i < 10; i++) {  // static code bloce with for loop inside
            
//            private_$1char += 1;      //cannot assign a new value to a final veriable
            proByte += 1;            // using plus equals to increment the value
            _publicInt ++;           // using ++ operation to increment the value
            
                if (i >6) {
                    continue;
                }
        }
    
    
}
    
    
    // All instance variables are inisalised to their default values
    
    
}

class Except extends AccessModifiersAndKeywords{
    
    Except e = new Except();
    
    public enum days{Mon, Tue, Wed};        //declearing an enum
    
    

 public void exce(int a) throws Exception{ // declareing method throws exception
 
     if(a<0){
      throw new NumberFormatException(); // throwing number format exception
     }
     else{
//         assert; // assert is a keyword
//         goto    // goto is a keyword 
         super.pubShort = 9;
//         transient  // is a keyword
//         native     // is a keyword
//         synchronized // is a keyword
//         const // is a keyword
         if ( e instanceof Object) {
             Object object = (Object) e;
             
         }
         
         try {
             do {                 
                 pubShort++;
             } while (pubShort == 9);
         } catch (Exception e) {
         }finally{}
         
         switch(a){
         
             case (1) : break;
             default : break;
                 
         }
     }
 }

}

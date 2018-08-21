/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8.chapter1enums;
/**
 * Jason.blood
 */
public class C1Enums {
    
    
    enum Drink{
        SMALL(8, "Regular"){
    
                @Override
                public double getCost(){
                    return 1.75;
                }
            }, 
        MEDIUM(12, "Regular"),  // enum creaton Drink is a type of class and SMALL, MEDIUM and LARGE are instances of Drink
    
        LARGE(16, "Large"){                    // enum values are public static final by default
        
            @Override
            public double getCost(){
                
                return 3.00;
            }
        };
    
        Drink(int size, String lid){                        // enum constructor 

            this.size = size;
            this.lid = lid;
        }

        private int size;                       // enum instance veriable
        private String lid;

        public int getSize(){                   // enum public method

            return size;
        }
        
        public String getLid(){                 // method to return enum Drink's Lid size (String)
        
            return this.lid;
        }
        
        public double getCost(){
        
            return 2.50;
        }
    }
    
    public static class Inner{}
    public class Inner2{}
    
    public static void main(String[] args) {
        
        Inner in = new Inner();
        
        for(Drink d : Drink.values())             // enhanced for loop
            System.out.println(d + "\t" + d.getSize() + "\t" + d.getLid() + "\t" + d.getCost() + " euro\n");
        
        
        Drink [] ds = Drink.values();
        
        for (Drink d : ds) {
            
            System.out.println(d + "\t" + d.getSize() + "\t" + d.getLid() + "\t" + d.getCost() + " euro");
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8.Chapter2;
/**
 * Jason.blood
 */
public class Chapter2Interfaces implements extendable, T1, T2{      // all interface methods must be implemented even ones inhereted by the 
                                                                    //interfaces being implemented
    @Override
    public void first(){}
    @Override
    public void second(){}
    @Override
    public void third(){}
    @Override
    public void extending(){}
    
    @Override
    public String bake(){return "new Baking";}  // Overriding method must be put in place or compilation will fail 
    
    public static void main(String[] args) {
        System.out.println(new Chapter2Interfaces().bake());
    }
    
}

interface Inter1able{

    void first();
}
interface Inter2able{

    void second();
}
interface Inter3able{

    void third();
}

interface extendable extends Inter1able, Inter2able, Inter3able{ // interfaces can extend many interfaces
    
    void extending();
}

interface T1{ default String bake(){return "Baking 1";}}
interface T2{ default String bake(){return "Baking 2";}}
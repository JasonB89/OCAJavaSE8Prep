/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8.Chapter2;
/**
 * Jason.blood
 */
public class Encap {
    
    private int x = 5;      // allows for encapsulation because other programmers can't change the value directly
    public  int y = 7;      // this allows anyone to access this instance veriable and change it's value bad practice

    public int getX() {  // allows other programmers to read and use the value but not change it 
        return x;
    }

    public int getY() {     // this is made redundant since the instance veriable is public
        return y;
    }

    public void setX(int x) {       // allows other programmers to change  the value but not use or read it 
        this.x = x;
    }

    public void setY(int y) {   // this is made redundant since the instance veriable is public
        this.y = y;
    }
    
    
    
}

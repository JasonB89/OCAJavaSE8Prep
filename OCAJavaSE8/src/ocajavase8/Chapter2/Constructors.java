/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocajavase8.Chapter2;
/**
 * Jason.blood
 */
public class Constructors {
    
    public static void main(String[] args) {
        
        Male mike = new Male(true);
        Male tom = new Male("Tom", 28, false);
        
        Female miriam = new Female("Miriam", 24, false);
        
        Other sam = new Other("Sam", 23, true, true);
        
        RandHuman rand;
        
        miriam.print();
        System.out.println("");
        mike.print();
        System.out.println("");
        tom.print();
        System.out.println("");
        sam.print();
        System.out.println("");
        
        for (int i = 0; i < 30; i++) {
            rand = new RandHuman(RandHuman.randName(),RandHuman.randAge(),RandHuman.randSex());
            System.out.println("");
            rand.print();
        }
    }
}

class CardGame{

    private String name;

    public CardGame(String name) {
        this.name = name;
    }
    
}

class Poker extends CardGame{

    private String [] WinningHands;

    public Poker(String [] WinningHands) {
        super("Poker");
        this.WinningHands = WinningHands;
    }
    
    
}

class TexasHoldem extends Poker{

    public TexasHoldem(String [] hand) {
        super(hand);
    }

    
}

class Human{

    private String name;
    private int age;
    private enum Sex{MALE, FEMALE, OTHER}
    
    private Sex sex;
    
    Human(){                                        // no-args constructor different from the default constructor
    
        this.name = "unknown";                      // default values being asigned
        this.age = 18;
        this.sex = Sex.MALE;
    }
    Human(String sex){                              // first Overloaded constructor which takes a String 
    
        this.name = "unknown";
        this.age = 18;
        this.sex = Sex.valueOf(sex);
    }
    Human(String name, int age, String sex){        // second overloaded constructor which takes multiple values
    
        this.name = name;
        this.age = age;
        this.sex = Sex.valueOf(sex);
    }

    public String getName() {                       // getters for private variables
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }
    
    public void print(){                                // print methoh to be inherited
    
        System.out.println("Name:\t\t" + getName());
        System.out.println("Age:\t\t" + getAge());
        System.out.println("Sex:\t\t" + getSex());
    }
    
}

class Male extends Human{
    
    private boolean beard;
    
    Male(){                         // if no other constructor is present this will be implicit
    
        super();                    // if the superclass has a no args constructor this will be implicit
        this.beard = false;
    }
    
    Male(boolean beard){            // overloaded constructor which calls super implicitly
    
        this.beard = beard;
    }

    Male(String name, int age, boolean beard){  // overloaded constructor that takes in multiple values 
    
        super(name, age, "MALE");               // values being passed to the super constructor
        
        this.beard = beard;
    }
    
   public boolean getBeard(){
   
       return this.beard;
   }
   
    @Override
   public void print(){                         // method overridden from perant class
   
     super.print();
        System.out.println("Beard:\t\t" + getBeard());
   }
}

class Female extends Human{

    private boolean highheels;
    
    Female(){
    
        super("FEMALE");                    //  default value sent to super constructor
        this.highheels = true;
    }
    
    Female(boolean highheels){
    
        super("FEMALE");
        this.highheels = highheels;
    }
    Female(String name, int age, boolean highheels){
    
        super(name, age, "FEMALE");
        this.highheels = highheels;
    }

    public boolean getHighheels(){
    
        return this.highheels;
    }
     @Override
   public void print(){
   
     super.print();
        System.out.println("Highheels:\t" + getHighheels());
   }
}

class Other extends Human{
    
    private boolean highheels;
    private boolean beard;

    Other(){                    // if no other constructor exists this will be implicit
        
        super("OTHER");                 
        this.highheels = true;
        this.beard = true;
    }
    
    Other(String name, int age){
    
        super(name, age, "OTHER");
        this.highheels = true;
        this.beard = true;
    }
    
    Other(String name, int age, boolean highheels, boolean beard){
    
        super(name, age, "OTHER");
        this.highheels = highheels;
        this.beard = beard;
    }
    
    public boolean getHighheels(){
    
        return this.highheels;
    }
    
    public boolean getBeard(){
    
        return this.beard;
    }
    
    public void print(){
   
     super.print();
        System.out.println("Highheels:\t" + getHighheels());
        System.out.println("Beard:\t\t" + getBeard());
   }
}

class RandHuman extends Human{


    public RandHuman(String name, int age, String sex) {
        super(name, age, sex);
    }
    
    public RandHuman() {
        
       this(randName(),randAge(), randSex());               // calling the constructor in the same class and passing values generated randomly be methods
    }

    static String randSex(){
    
        int x = (int) (Math.random() * 3);
        
        String sex = new String []{"MALE","FEMALE","OTHER"}[x]; // passes a random value to the local veriable sex
        
        return sex;
    }
    
    static int randAge(){
    
        int x = (int) (Math.random()* 80);                      // generats a random int between 0 and 80 to pass back
        
        return  x;
    }

    static String randName(){
    
        int x = (int) (Math.random()* 10);
        String name = new String []{"Taylor", "Riley", "Reese", "Sage", "Angel", "Sam", "Charlie", "Elliot", "Ali", "Morgan"}[x];
        
        return name;
    }
    
}
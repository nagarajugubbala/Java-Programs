package Inheritance;

class one 
{ 
    public void print_geek() { 
        System.out.println("Tchie"); 
    } 
}
class two extends one { 
    public void print_for() 
    { 
        System.out.println("frogs"); 
    } 
}
public class Single { 
    public static void main(String[] args) 
    { 
        two g = new two(); 
        g.print_geek(); 
        g.print_for();
    } 
} 
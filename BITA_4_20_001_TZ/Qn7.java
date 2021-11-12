import java.util.Scanner; 
public class Qn7{ 
    public static void main(String args[]){ 
        int a, b, t; 
        Scanner scn = new Scanner(System.in); 
        System.out.print("Enter The Fisrt number : "); 
        int x = scn.nextInt(); 
        System.out.print("Enter the second number : ");
        int y = scn.nextInt(); 
        a = x; 
        b = y; 
        while(b != 0) 
        { 
            t = b; 
            b = a%b; 
            a = t; 
        } 
        int HCF = a; 
        int LCM = (x*y)/HCF; 
        System.out.println("HCF of " + x + " and " + y + " is = "  +HCF); 
        System.out.print("And LCM of " + x + " and " + y+ " is = " +HCF); 
    } 
} 
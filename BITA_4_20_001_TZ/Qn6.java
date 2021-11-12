import java.util.Scanner;
class Qn6 {
    public static void main(String[] args){
        System.out.print(" Please, Insert your level of performance between 0 and 100 _ ");
        Scanner scn = new Scanner(System.in);
        int Level = scn.nextInt();
        System.out.print("And your basic salary_ ");
        double Salary = scn.nextDouble();
        if (Level >= 90){
        Salary += Salary * 0.03;     
        }
        System.out.println("Your level of perfomance is: "+Level+" yet your actual salary is "+Salary);
       
    }
}

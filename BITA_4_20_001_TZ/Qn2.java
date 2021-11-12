import java.util.Scanner;
class Qn2{
    public static void main(String[] args) {
        System.out.println("Welcome to ");
        System.out.println("**The Word Game**");
        System.out.println("Answer the followings and we will make up a story for you");

        String Name, City, College, Proffession, Animal, Pet;

        System.out.print("What is your Name? _  ");
        Scanner scn = new Scanner(System.in);
        Name = scn.nextLine();

        System.out.print("How old are you? _  ");
        int Age = scn.nextInt();

        System.out.print("What city do you live in? _ ");
        scn.nextLine();
        City = scn.nextLine();

        System.out.print("What colledge did you attend? _ ");
        College = scn.nextLine();
        
        System.out.print("What is your proffession? _ ");
        Proffession = scn.nextLine();

        System.out.print("What type of animal(pet) do you keep in your house? _ ");
        Animal = scn.nextLine();

        System.out.print("What is the name of your "+Animal+ "? _ ");
        Pet = scn.nextLine();

        System.out.print("There once was a person named " +Name+ " who lived in "+City+ ". At the age of "+Age+", "+ Name);
        System.out.print(" went to college at " + College+". "+Name+" graduated and went to work as "+Proffession);
        System.out.print(". Then, " +Name+ " adopted a/an "+Animal+ " named " +Pet+ ". They both lived happily ever after!");
    }
}
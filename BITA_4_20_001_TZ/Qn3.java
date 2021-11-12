import java.util.Scanner;
class Qn3 {
    public static void main(String[] args) {
        System.out.print(" Insert the number of participants: ");
        int No_of_participants, Revenue;
        Scanner scn = new Scanner(System.in);
        No_of_participants = scn.nextInt();
        Revenue = 2500 * No_of_participants;
        System.out.println("The Revenue that the company will earn is: $ " +Revenue );
    }
    
}

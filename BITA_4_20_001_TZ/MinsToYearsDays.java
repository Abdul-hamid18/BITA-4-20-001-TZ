import java.util.Scanner;
class MinsToYearsDays {
    public static void main(String[] args){
        System.out.print("Enter the number of minutes you want: _ ");
        Scanner scn = new Scanner(System.in);
        int minutes  = scn.nextInt();
        int Years = minutes / 525600;
        int Days = (minutes % 525600)/1440;
        System.out.println(minutes+" Minutes is approximately " +Years+ " years and "+Days+" days.");       
    }
}
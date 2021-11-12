import java.util.Scanner;
class Qn4{
        public static void main(String[] args) {
            
            Scanner scn = new Scanner(System.in);
            
            System.out.print("Insert numbers of gallons of gas in tank: _ ");
            double gas_tank = scn.nextDouble();
            
            System.out.print("Insert fuel efficiency(Number of miles per gallon): _ ");
            double fuel_efficiency = scn.nextDouble();
            
            System.out.print("Insert the price of gas per gallon: _");
            double gas_price = scn.nextDouble();
            
            scn.close();
            
            double cost_250_miles = 250 / fuel_efficiency * gas_price;
            System.out.println("Cost per 250 miles:"+ cost_250_miles);
            double max_distance = fuel_efficiency * gas_tank;
            System.out.println("Maximum distance: " + max_distance);
    }
}

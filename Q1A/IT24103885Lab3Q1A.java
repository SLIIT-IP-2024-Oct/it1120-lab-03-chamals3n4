import java.util.Scanner;

public class IT24103885Lab3Q1A{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double priceOfKilo;
        double numOfKilo;
        double total;
        System.out.printl("enter the price of one kilo of rice : ");
        priceOfKilo = scanner.nextDouble();
        System.out.printl("enter the num of one kilo you want : ");
        numOfKilo = scanner.nextDouble();
        total = priceOfKilo*numOfKilo;
        System.out.println("Total : " + total);
    }
}

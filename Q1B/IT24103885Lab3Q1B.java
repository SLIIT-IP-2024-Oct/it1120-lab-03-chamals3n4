import java.util.Scanner;

public class IT24103885Lab3Q1B{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double priceOfKilo;
        double numOfKilo;
        double total;
        double discount;
        double totalAfterDiscount;
        System.out.println("enter the price of one kilo of rice : ");
        priceOfKilo = scanner.nextDouble();
        System.out.println("enter the num of one kilo you want : ");
        numOfKilo = scanner.nextDouble();
        total = priceOfKilo*numOfKilo;
        discount = total*0.10;
        totalAfterDiscount = total-discount;
        System.out.println("Total after discount : " + totalAfterDiscount);
    }
}


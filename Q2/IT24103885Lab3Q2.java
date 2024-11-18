import java.util.Scanner;

public class IT24103885Lab3Q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double salary;
        double numOfOTHrs;
        double OTRate;
        double total;
        System.out.print("enter the monthly salaryV: ");
        salary = scanner.nextDouble();
        System.out.print("enter the num of OT HOURS: ");
        numOfOTHrs = scanner.nextDouble();
        System.out.print("enter the num of OT HOURly rate: ");
        OTRate = scanner.nextDouble();
        total = salary+(numOfOTHrs*OTRate);
        System.out.println("salry including OT IS : " + total);

    }
}

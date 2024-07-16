import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("\nEnter the basic salary: ");
        double basicSalary = sc.nextDouble();

        double pf= 0.15*basicSalary;
        double da= 0.10*basicSalary;
        double netsalary= basicSalary+pf+da;

        System.out.println("Emp Name : "+name);
        System.out.println("----------------------");
        System.out.println("Basic Sal : "+basicSalary);
        System.out.println("PF :        "+pf);
        System.out.println("DA :        "+da);
        System.out.println("----------------------");
        System.out.println("Net Sal :   "+netsalary);
    }

}

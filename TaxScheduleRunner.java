import java.util.Scanner;

public class TaxScheduleRunner {
    public static void main(String[] args){
        System.out.println("single for enter '1' or enter '2' : ");
        double salary;
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println("Enter the salary in dolar : ");

        salary = in.nextDouble();
        in.close();

        TaxSchedule tx = new TaxSchedule();
        double Tax = tx.Schedule(a,salary);
        System.out.println("total tax : "+ Tax);
    }
}


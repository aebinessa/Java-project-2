import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Employee abdullah = new Employee(111, "abdullah", "webDev", 1000);

        Calendar firstDepositDate = Calendar.getInstance();
        Calendar secondDepositDate = Calendar.getInstance();
        Calendar thirdDepositDate = Calendar.getInstance();

        abdullah.paymentAddition(firstDepositDate.getTime(), 1000, "Direct Deposit");
        abdullah.paymentAddition(secondDepositDate.getTime(), 1500, "cheque");
        abdullah.paymentAddition(thirdDepositDate.getTime(), 300, "transaction");

        System.out.println("Employee: " + abdullah.getName());
        abdullah.paymentHistory();
        System.out.println("Total salary: " + abdullah.salaryCalculation(300, 400, 200));

        Employee omar = new Employee(0, null, null, 0);

        omar.setBasicSalary(5000);
        omar.setEmployeeId(29);
        omar.setName("omar al omar");
        omar.setPosition("network admin");

        omar.paymentAddition(firstDepositDate.getTime(), 700, "cash");
        omar.paymentAddition(secondDepositDate.getTime(), 2000, "credit");
        omar.paymentAddition(thirdDepositDate.getTime(), 500, "credit");

        System.out.println("Employee: " + omar.getName());
        omar.paymentHistory();
        System.out.println("Total salary: " + omar.salaryCalculation(500, 1000, 90));

    }
}
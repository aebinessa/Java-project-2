import java.util.ArrayList;
import java.util.Date;

public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private int basicSalary;

    private ArrayList<Integer> payments = new ArrayList<Integer>();

    public ArrayList<Integer> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Integer> payments) {
        this.payments = payments;
    }

    private ArrayList<String> paymentMethod = new ArrayList<>();

    public ArrayList<String> getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(ArrayList<String> paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    private ArrayList<Date> paymentHistoryDate = new ArrayList<>();

    public ArrayList<Date> getPaymentHistoryDate() {
        return paymentHistoryDate;
    }

    public void setPaymentHistoryDate(ArrayList<Date> paymentHistoryDate) {
        this.paymentHistoryDate = paymentHistoryDate;
    }

    public Employee(int employeeId, String name, String position, int basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
    }

    public int salaryCalculation(int overtime, int bonuses, int deduction) {
        return basicSalary + overtime + bonuses - deduction;
    }

    public void paymentHistory() {

        for (int pay = 0; pay < payments.size(); pay++) {
            System.out.println(
                    "    " + paymentHistoryDate.get(pay) + " Amount:  " + payments.get(pay) + " Payment Method:  "
                            + paymentMethod.get(pay));
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void paymentAddition(Date date, int amount, String method) {
        paymentHistoryDate.add(date);
        payments.add(amount);
        paymentMethod.add(method);

    }
}
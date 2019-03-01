package pkg120171248;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    static Employee Employees[] = new Employee[10];

    public static void print() {
        for (int i = 0; i < Employees.length; i++) {
            System.out.println(Employees[i].getName());
            System.out.println(Employees[i].getDepartment());
            System.out.println(Employees[i].getSalary());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp;
        double sal;
        double bns;
        tmp = JOptionPane.showInputDialog("salary");
        sal = Double.parseDouble(tmp);
        tmp = JOptionPane.showInputDialog("salary");
        bns = Double.parseDouble(tmp);
        for (int i = 0; i < Employees.length / 2; i++) {
            Employees[i] = new Employee(JOptionPane.showInputDialog("name"),
                    JOptionPane.showInputDialog("department"), sal,bns);

        }
        for (int i = 0; i < Employees.length / 2; i++) {
            Employees[i] = new Employee(sc.next(), sc.next(), sc.nextInt(), sc.nextInt());

        }
        Arrays.sort(Employees, (a, b) -> a.getName().compareTo(a.getName()));
        print();
    }

}

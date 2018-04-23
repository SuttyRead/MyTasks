package LabWork.LabWork2_2_3;

//Write class Employee with method calculateSalary with argument
//name(String) and varargs salary(double…). This method should
//calculate total salary of employee and print his name and total salary.
//Write class Accountant that will be create Employee instance and
//use his method with a different number of data.

public class Main {
    public static void main(String[] args) {
        Employee ivanov = new Employee();
//        ivanov.setAssociateSalary(4500);
//        System.out.println(ivanov.getAssociateSalary());
        ivanov.calculateSalary(ivanov);
        Accountant accountant = new Accountant();
        accountant.temp();


    }
}

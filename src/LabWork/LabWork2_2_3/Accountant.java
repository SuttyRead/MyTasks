package LabWork.LabWork2_2_3;

public class Accountant {
    Employee petrov = new Employee();

    public void temp() {
        petrov.setAssociateSalary(4500);
        petrov.calculateSalary(petrov);
    }

}

package LabWork.LabWork2_2_4;

//Create class Person with fields firstName(String),
//lastName(String), age(int), gender(String), phoneNumber(int),
//and  five overloaded methods that set this fields with different
//arguments list.  Create class that will be use instance of class Person and his methods.

public class Main {
    public static void main(String[] args) {

        Person ivanov = new Person("Ivan", "ivanov", 25, "male", 376657576);
        Person ivanov1 = new Person("Ivan1", "ivanov1", 25, "male", 376657576);
        Person ivanov2 = new Person("Ivan2", "ivanov2", 25, "male", 376657576);
        Person ivanov3 = new Person("Ivan3", "ivanov3", 25, "male", 376657576);
        Person ivanov4 = new Person("Ivan4", "ivanov4", 25, "male", 376657576);
        Person ivanov5 = new Person("Ivan5", "ivanov5", 25, "male", 376657576);
        System.out.println(ivanov.toString());
        System.out.println(ivanov1.toString());
        System.out.println(ivanov2.toString());
        System.out.println(ivanov3.toString());
        System.out.println(ivanov4.toString());
        System.out.println(ivanov5.toString());
    }
}
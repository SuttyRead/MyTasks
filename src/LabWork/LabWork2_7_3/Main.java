package LabWork.LabWork2_7_3;


//Create classes:
//1) Base class Device (manufacturer(String), price(float), serialNumber(String));
//2) Subclasses Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter(speed (int), mac (String));
//Add getters/setters and constructor to each class


public class Main {
    public static void main(String[] args) {
        Device device = new Device();
        Monitor monitor = new Monitor();
        System.out.println(device.toString());
        System.out.println(monitor.toString());

    }
}

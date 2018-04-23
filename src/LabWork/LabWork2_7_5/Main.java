package LabWork.LabWork2_7_5;


//Create classes:
//1) Base class Device (manufacturer(String), price(float), serialNumber(String));
//2) Subclasses Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter(speed (int), mac (String));
//Add getters/setters and constructor to each class


public class Main {
    public static void main(String[] args) {
        Device device = new Device();
        Device monitor = new Monitor();
        Device mouse = new Mouse();
        //System.out.println(device.toString());
        // System.out.println(monitor.toString());

        Device[] devices = new Device[3];

        devices[0] = device;
        devices[1] = monitor;
        devices[2] = mouse;

        for (int i = 0; i < devices.length; i++) {
            System.out.println(devices[i]);
        }

    }
}

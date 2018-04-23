package LabWork.LabWork2_7_5;

import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;
    private String ethernetAdapter;
    private int speed;
    private String mac;

    {
        setEthernetAdapter("hgnfdsgfd");
        setMac("rgffdgfdd");
        setResolutionX(154);
        setResolutionY(187);
        setSpeed(587);
    }

    public Monitor() {

    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY, String ethernetAdapter, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.ethernetAdapter = ethernetAdapter;
        this.speed = speed;
        this.mac = mac;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public String getEthernetAdapter() {
        return ethernetAdapter;
    }

    public void setEthernetAdapter(String ethernetAdapter) {
        this.ethernetAdapter = ethernetAdapter;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                ", ethernetAdapter='" + ethernetAdapter + '\'' +
                ", speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX &&
                resolutionY == monitor.resolutionY &&
                speed == monitor.speed &&
                Objects.equals(ethernetAdapter, monitor.ethernetAdapter) &&
                Objects.equals(mac, monitor.mac);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), resolutionX, resolutionY, ethernetAdapter, speed, mac);
    }
}

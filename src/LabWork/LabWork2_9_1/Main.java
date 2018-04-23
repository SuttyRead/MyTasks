package LabWork.LabWork2_9_1;

public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3, 7));
        System.out.println(reverseString(myStr));
    }

    public static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        str = stringBuilder.toString();
        return str;
    }

}

package LabWork.LabWork2_9_3;

public class Main {
    private static char[] charArray;

    public static void main(String[] args) {
        String str = "Hello World";
        uniqueChars(str);
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }

    public static char[] uniqueChars(String str) {
        charArray = str.toCharArray();
        return charArray;
    }


}

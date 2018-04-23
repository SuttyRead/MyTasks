package LabWork.LabWork2_9_2;

public class Main {
    public static void main(String[] args) {
        String mystr1 = "Cartoon";
        String mystr2 = "Tomcat";
        int temp = 0;
        for (int i = 0; i < mystr1.length(); i++) {
            for (int j = 0; j < mystr2.length(); j++) {
                if (mystr1.charAt(i) == mystr2.charAt(j)) {
                    temp++;
                }
            }
            if (temp == 0) {
                System.out.println(mystr1.charAt(i));
            }
            temp = 0;
        }
    }
}

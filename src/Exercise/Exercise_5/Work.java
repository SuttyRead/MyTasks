package Exercise.Exercise_5;

public class Work {
    public void printSimpleNumber() {
        int temp = 0;
        for (int i = 2; i < 101; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    temp += j;
                }
            }
            if (temp == 1) {
                System.out.println(i + " Simple number");
            } else {
                System.out.println(i + " Compoud number");
            }
            temp = 0;
        }
    }
}

package cikl;

public class testFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            //System.out.println(Math.pow(2, i));
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
}

package labWhile;

import java.util.Scanner;

public class testWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        while(name.isEmpty()){
            System.out.println("Name?");
            name = sc.nextLine();
        }
        System.out.printf("Hello, %s!!!\n",name);
    }
}

package lab22;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваше имя?");
        String name = sc.nextLine();
        if( !name.isEmpty() ){  // "".equals(name)
            System.out.printf("Привет %s!!! \n", name);
        }else{
            System.out.println("Пошёл нах незнакомец");
        }
    }
}

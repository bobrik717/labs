package labSwitch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.println("A????");
        if(sc.hasNextInt()){
            a = sc.nextInt();
        }
        
        String word = "";
        
        switch(a)
        {
            case 1: 
                word = "Одному";
                break;
            case 2: 
                word = "Двум";
                break;
            case 3: 
                word = "Трём";
                break;
            case 4: 
                word = "Четырём";
                break;
            case 5: 
                word = "Пяти";
                break;
            case 6: 
                word = "Шести";
                break;
            case 7: 
                word = "Семи";
                break;
            case 8: 
                word = "Восьми";
                break;
            case 9: 
                word = "Девяти";
                break;
            default:
                word = "Нулю";                
        }
        System.out.printf("А равно %s",word);
    }
}
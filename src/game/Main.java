package game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int random = r.nextInt(101);
        int anser = -1;
        int count = 7;
        while (anser != random) {            
            System.out.printf("You have %d attempts\n",count);
            System.out.println("Number??!!");
            if(sc.hasNextInt()){
                anser = sc.nextInt();            
                
                if( anser == 0 || count == 0 ){
                    System.out.println("You loose!!!");
                    break;
                }
                if(anser > random){
                    System.out.println("Many");
                } 
                if(anser < random){
                    System.out.println("Little");
                }
                count--;
            }else{
                System.out.println("Must be numeric");
                count--;
            }
        }
        System.out.printf("Number is %d, attempts %d\n",random,7 - count);
    }
}

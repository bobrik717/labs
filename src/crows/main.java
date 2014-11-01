package crows;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Сколько??????");
        Scanner sc = new Scanner(System.in);        
        int count = 0;
        if(sc.hasNextInt()){
            count = sc.nextInt();
        }
        int lastInt = count % 10;
        int lastDec = count % 100;
        String word = "";               
        
        if( (lastInt == 0 || lastInt > 4) || (lastDec >= 11 && lastDec <= 20) ){
            word = "ворон";
        }
        
        if( lastInt == 1 && lastDec != 11 ){
            word = "воронa";
        }
        
        if( (lastInt > 1 && lastInt < 5) && (lastDec < 11 || lastDec > 14) ){
            word = "вороны";
        }               
        
        System.out.printf("На ветке %d %s\n",count,word);        
    }
}

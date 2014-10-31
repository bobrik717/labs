package arrays;

import java.util.Scanner;

public class arraysSimplTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int min = 0,max = 0,sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Number?");
            if(sc.hasNextInt()){                
                arr[i] = sc.nextInt();
            }else{
                sc.nextLine();
                System.out.println("Not number, must by number!!");
            }
        }
        min = arr[0];
        max = arr[0];
        for (int num: arr) {
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
            sum += num;
        }        
        System.out.printf("Min = %d, Max = %d, Sum = %d, Average = %f",min,max,sum,sum/(double)arr.length);
    }
}

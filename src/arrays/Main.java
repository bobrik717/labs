package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int[]  m = new int[3];
        m[0] = 3;
        m[1] = 4;
        m[2] = 7;*/
        int[] m = {2,6,0,2,4,6,8};
        int[][] m2 = new int[2][3];
        int[][] matrix = {
            {1,2,3},
            {4,5}
        };               
        
        String[] names = {"Dan","Bob","Volandemort","Andi"};
        String[] names2;
        
        for (int i = 0; i < m.length; i++) {
            //System.out.println(m[i]*2);
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        Arrays.sort(names);
        names2 = Arrays.copyOfRange(names, 1,3);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("names2");
        for(String s: names2){
            System.out.println(s);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //System.out.printf("%2d",matrix[i][j]);
            }
            //System.out.println();
        }
        
    }
}

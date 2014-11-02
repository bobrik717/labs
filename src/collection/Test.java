package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String name = "";
        //int counter = 0;
        do{
            System.out.println("Name?");
            name = sc.nextLine();
            if(!name.isEmpty()){
                names.add(name);
                //counter++;
            }
        }while(!name.isEmpty());
        
        //String[] namesSorted = new String[counter];
        Object[] namesSorted = names.toArray();
        /*int i = 0;
        for(String s: names){
            namesSorted[i] = s;
            i++;
        }
        */
        Arrays.sort(namesSorted);
        List list = Arrays.asList(namesSorted);
        System.out.println();
        for(Object s1: list)
            System.out.println(s1);
    }
}

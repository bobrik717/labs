package collection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        
        for(Integer o: list){
            System.out.println(o);
        }
    }
}

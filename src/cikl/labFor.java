package cikl;

public class labFor {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
        {
            if( i == 3 )
                continue;                
            System.out.println(i);
            if( i==8 )
                break;
        }
    }
}

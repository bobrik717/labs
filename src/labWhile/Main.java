package labWhile;

public class Main {
    public static void main(String[] args) {
        int a = 1001;
        /*while(a < 1000){
            a *= 2;
            if( a == 32 ) continue;
            if( a == 512 ) break;            
            System.out.println(a);            
        }*/
        do{
            a *= 2;
            if( a == 32 ) continue;
            if( a == 512 ) break;            
            System.out.println(a);
        }while(a < 1000);
    }
}

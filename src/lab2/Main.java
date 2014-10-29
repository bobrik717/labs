package lab2;

public class Main {

    public static void main(String[] args) {
        int a = 50;
        if( (a > 0) && (a<10) ){
            System.out.println("а < 10 и a > 0");
        }else{
            System.out.println("a > 10 or a < 0");
        }
        
        String s = ( (a > 0) && (a<10) )?"(a > 0) && (a<10)":"!((a > 0) && (a<10))";
        System.out.println(s);
    }
    
}

package labWhile;

public class fobonachi {
    public static void main(String[] args) {
        int prev = 0;
        int num = 1;
        int next;
        do{
            next = prev + num;
            prev = num;
            num = next;
            System.out.println(num);
        }while (num < 1000);
    }
}

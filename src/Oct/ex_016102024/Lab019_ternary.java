package Oct.ex_016102024;

public class Lab019_ternary {
    public static void main(String[] args) {
        int a = 100 ;
        int b = 45 ;
        int c = 75 ;

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println(max);
    }
}

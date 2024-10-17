package Task161024;

public class task004 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int max = (a>b)? a : b;
        System.out.println("The maximum of" + a + "and" + b + "is:"+ max);
    }
}

package Task;

public class task002 {
    public static void main(String[] args) {
        int a = 20 ;
        System.out.println(--a + a++ + a--);
//   1st expr a=20/ --a= 19
//   2nd expr a=19/ a++= 20
//   3rd expr a=20/ a--= 19

        System.out.println(a);
     //   the ans is now 19 & 58
    }
}

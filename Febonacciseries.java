// public class Febonacciseries {
//     public static void main(String[] args) {
//         int n1 = 0, n2 = 1, n3, i, count = 5;
//         System.out.println(n1);
//         System.out.println(n2);
//         for (i = 2; i < count; ++i) {
//             n3 = n1 + n2;
//             System.out.println(n3);
//             n1 = n2;
//             n2 = n3;
//         }
//     }
// }

// // With Recursion 
import java.util.Scanner;

class Fibonacciseries {
    static int fib(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        return fib(x - 1) + fib(x - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers : ");

        int n = sc.nextInt();
        System.out.println("Total " + fib(n));
        System.out.println("Series");
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i) + " ");
        }

    }

}
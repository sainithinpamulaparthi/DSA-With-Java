/***import java.util.*;

public class One {
    public static void main(String[] args) {
        // Example usage
        int a = 3, b = 4, c = 5, x = 7;
        System.out.println(Netflix(a, b, c, x)); // Output: YES
    }

    static String Netflix(int a, int b, int c, int x) {
        if (a + b >= x)
            return "YES";
        else if (c + b >= x)
            return "YES";
        else if (a + c >= x)
            return "YES";
        else
            return "NO";
    }
}
**/
import java.util.*;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs from user
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        //System.out.print("Enter value for x: ");
        int x = sc.nextInt();

        System.out.println(Netflix(a, b, c, x));
    }

    static String Netflix(int a, int b, int c, int x) {
        if (a + b >= x)
            return "YES";
        else if (c + b >= x)
            return "YES";
        else if (a + c >= x)
            return "YES";
        else
            return "NO";
    }
}

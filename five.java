import java.util.*;
public class five {
    static String range(int a,int c,int d){
        if(a>=0&&a<=100){
          if(a>=c&&a>=d){
           return "all goes good";
            } else{
            return "its not between c and d";
                }
        }else{
        return "not in range of 0 to 100"; 
        }   
    }

    static int mango(int x,int y,int z){ 
        if(x<=y&&y<=z)
        return ((z-y)/x);
        else
        return 0;


        //if(x<(y*z)+w)
        //return "Overflow";
       // else if(x>(y*z)+w)
       // return "unfilled";
        //else
        //return "filled";

       // return (n/(x*3));

   /*** if(C>(A+B))
    return "YES";
    else if(B>(A+C))
    return "YES";
    else if(A>C+B)
    return "YES";
    else
    return "NO";*/

    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
//int w=sc.nextInt();
int a=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
System.out.print(range(a,c,d));
}
}

/***
public class Two {
    static int playlist(int n, int x) {
        return (n / (x * 3));
    }

    static int truck(int x, int y, int z) {
        int availableSpace = y - z;
        return availableSpace / x;
    }

    static String bucket(int w, int x, int y, int z) {
        int remWater = x - w;
        int waterFromTap = y * z;
        if (remWater == waterFromTap)
            return "fill";
        else if (remWater > waterFromTap)
            return "unfilled";
        else if (remWater < waterFromTap) {
            return "over";
        } else {
            return "over";
        }
    }

    static String armys(int a, int b, int c) {
        if (c > a + b) {
            return "yES";
        } else if (a > c + b) {
            return "yES";
        } else if (b > a + c) {
            return "yES";
        } else {
            return "NO";
        }
    }

    static int choco(int c, int x, int y)
    // 5 5 2
    {
        if (c > x) {
            int rem = c - x;
            int cost = rem * y;
            return cost;
        }
        return 0;
    }

    static String netflix(int a, int b, int c, int x) {
        if (a + b >= x || c + b >= x || c + a >= x) {
            return "YES";
        }
        // else if (c + b <= x)
        // {
        // return "YES";
        // }
        // else if (c + a <= x)
        // {
        // return "YES";
        // }
        return "NO";
    }

    static int gym(int gc, int pt, int budget) {
        if (gc + pt <= budget)
            return 2;
        else if (gc <= budget)
            return 1;
        else
            return 0;
    }

    static int billAmt(int bill) {
        float cost10per = bill - ((10.0f / 100.0f) * bill);
        float costFlat100 = bill - 100;

        if (cost10per < costFlat100) {
            return (int) cost10per;
        } else
            return (int) costFlat100;

        // return (int) (cost10per < costFlat100 ? cost10per : costFlat100);
    }

    public static void main(String[] args) {
        int a = 1;
        switch (131) {
            default:
                System.out.println(++a);
            case 12:
                System.out.println(++a);
                break;
            case 13:
                System.out.println(++a);

        }

    }
}

*/
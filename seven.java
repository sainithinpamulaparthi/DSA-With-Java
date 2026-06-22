import java.util.*;
public class seven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //let n=5

        /*for(int i=0;i<n;i++){
            if(i==0||i==n-1)
            for(int j=0;j<n;j++)
                System.out.print("* ");
            else
            for(int j=0;j<n;j++){
                if(j==0||j==n-1)
                    System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
             if(i==0||j==0||i==n-1||j==n-1)
               System.out.print("* ");
               else if(i==1||i==n-2||j==1||j==n-2)
                System.out.print("& ");
             else
               System.out.print("  ");
              }
              System.out.println();
           }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) 
                    System.out.print(n+" ");
                else if (i == 1 || j == 1 || i == n - 2 || j == n - 2) 
                    System.out.print((n-1)+" ");
                else 
                    System.out.print((n-2)+" ");
            }
            System.out.println();
        }

        for(int i=0;i<(2*n)-1;i++){
            for(int j=0;j<(2*n)-1;j++){
                if(i+j<(2*n)-1)
                 System.out.print(n-Math.min(i,j)+" ");
                else
                System.out.print(Math.max(i,j)-(n-2)+" ");
            }
            System.out.println();
        }

          for(int i=0;i<(2*n)-1;i++){
            for(int j=0;j<(2*n)-1;j++){
                if(i+j<(2*n)-1)
                 System.out.print((char) (96+ n-Math.min(i,j))+" ");
                else
                System.out.print((char) (96+Math.max(i,j)-(n-2))+" ");
            }
            System.out.println();
           }

           for(int i=0;i<(2*n)-1;i++){
            for(int j=0;j<(2*n)-1;j++){
                if(i+j<(2*n)-1)
                 System.out.print((char) (96 + Math.min(i,j)+1)+" ");
                else
                System.out.print((char) (96+(2*n-1)-(Math.max(i,j)))+" "); 
            }
            System.out.println();
           }

     //fibonacci series
          int a=0 , b=1;
           for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    //method using while loop
        int a=0,b=1,c;
        System.out.print("Fibonacci Series: ");
        if (n >= 1) System.out.print(a + " ");
        if (n >= 2) System.out.print(b + " "); 
        n=n-2;
        while(n>0)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            n--;
        }*/
    //print even fibonacci series
        int a=0,b=1,c;
        System.out.print("Fibonacci Even Series: ");
        while(n>0)
        {
            c=a+b;
            if(c%2==0){
            System.out.print(c+" ");
            n--;
            }
            a=b;
            b=c;
        }

        sc.close();
    }
}

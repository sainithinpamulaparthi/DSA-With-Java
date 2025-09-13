import java.util.*;

//""""""""Method 1 """"""""
/***
public class six {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Welcome to ACE Restaurant");
        System.out.println("Please enter your name:");
        String name=sc.nextLine();
        System.out.println("Hey "+name+", What do you like to have:");
         System.out.println("1.Veg pulao - 40rs");
          System.out.println("2.Curd Rice - 35rs");
           System.out.println("3.Chicken curry - 120rs");
            System.out.println("4.Chicken Biryani - 150rs");
             System.out.println("5.Double ka meeta - 25r");
        System.out.println("Select froom the menu:");
        int item=sc.nextInt();
        System.out.println("Enter your quantity:");
        int quantity = sc.nextInt();    
        switch(item){
            case 1:
                System.out.println("You have selected Veg Pulao, pay "+(40*quantity)+"rs");
                int amount1=sc.nextInt();
                if(amount1==(40*quantity))
                System.out.println("Order placed , kindly wait.");
                else
                System.out.println("Invalid amount, retry");
                break;
            case 2:
                System.out.println("You have selected Curd Rice, pay "+(35*quantity)+"rs");
                  int amount2=sc.nextInt();
                if(amount2==(35*quantity))
                System.out.println("Order placed , kindly wait.");
                else
                System.out.println("Invalid amount, retry");
                break;

            case 3:
                System.out.println("You have selected Chicken Curry, pay "+(120*quantity)+"rs");
                  int amount3=sc.nextInt();
                if(amount3==(120*quantity))
                System.out.println("Order placed , kindly wait.");
                else
                System.out.println("Invalid amount, retry");
                break;
            case 4:
                System.out.println("You have selected Chicken Biryani, pay "+(150*quantity)+"rs");
                  int amount4=sc.nextInt();
                if(amount4==(150*quantity))
                System.out.println("Order placed , kindly wait.");
                else
                System.out.println("Invalid amount, retry");
                break;
            case 5:
                System.out.println("You have selected Double ka meeta, pay "+(25*quantity)+"rs");
                  int amount5=sc.nextInt();
                if(amount5==(25*quantity))
                System.out.println("Order placed , kindly wait.");
                else
                System.out.println("Invalid amount, retry");
                break;

            default:
                System.out.println("Invalid");
                break;
        }

    }
}

  
"""""""""" Method 2"""""""

import java.util.*;

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ACE Restaurant");
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Hey " + name + ", What do you like to have:");
        System.out.println("1.Veg pulao - 40rs");
        System.out.println("2.Curd Rice - 35rs");
        System.out.println("3.Chicken curry - 120rs");
        System.out.println("4.Chicken Biryani - 150rs");
        System.out.println("5.Double ka meeta - 25rs");
        System.out.println("Select from the menu:");
        int item = sc.nextInt();
        System.out.println("Enter your quantity:");
        int quantity = sc.nextInt();

        int totalAmount = 0;

        switch(item){
            case 1:
                totalAmount = 40 * quantity;
                System.out.println("You have selected Veg Pulao, pay " + totalAmount + "rs");
                break;
            case 2:
                totalAmount = 35 * quantity;
                System.out.println("You have selected Curd Rice, pay " + totalAmount + "rs");
                break;
            case 3:
                totalAmount = 120 * quantity;
                System.out.println("You have selected Chicken Curry, pay " + totalAmount + "rs");
                break;
            case 4:
                totalAmount = 150 * quantity;
                System.out.println("You have selected Chicken Biryani, pay " + totalAmount + "rs");
                break;
            case 5:
                totalAmount = 25 * quantity;
                System.out.println("You have selected Double ka meeta, pay " + totalAmount + "rs");
                break;
            default:
                System.out.println("Invalid");
                sc.close();
                return;
        }

        System.out.println("Please enter the amount to pay:");
        int amountPaid = sc.nextInt();
        if(amountPaid == totalAmount){
            System.out.println("Order placed, kindly wait.");
        } else {
            System.out.println("Invalid amount, retry");
        }

        sc.close();
    }
}

 */
public class six{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       /*** int n=sc.nextInt();  //no.of rides
        int m=sc.nextInt(); // rides in special ticket
        int a=sc.nextInt();  //ticket price
        int b=sc.nextInt();  //special tic price

        int c1=n*a;                     // all single tickets
        int c2=(n/m)*b + (n%m)*a;       // special tickets + leftover singles
         int c3 = ((n + m - 1) / m) * b;  // enough special tickets to cover all rides
        if(c1<c2&&c1<c3)
        System.out.println(c1);
        else if(c2<c1&&c2<c3)
         System.out.println(c2);
         else
         System.out.println(c3);*/
       /***  int n = 5;
for (int i = 0; i < n; i++) {
    for (int j = 0; j <n-i; j++) {
        System.out.print("_");
    }
    for (int k=0;k<i+1; k++) {
        if(k<i)
        System.out.print("* ");
        else
        System.out.print("*");
    }
      for (int j = 0; j <n-i; j++) {
        System.out.print("_");
    }
    System.out.println();
}

int n=5;
for(int i=1;i<=n;i++)
{
    for(int j=1;j<i+1;j++){
    System.out.print(j+" " );
}
System.out.println();
    }

    int n=5;
for(int i=1;i<=n;i++)
{
    for(int j=1;j<i+1;j++){
    System.out.print(i+" " );
}
System.out.println();
    }
    */
int n=5;
int a=0;
for(int i=0;i<n;i++)
{
// a= a + (int)Math.pow(10,i);
  a= (int)Math.pow(10,i+1)/9;
    System.out.println(a*(i+1));
}

}
}
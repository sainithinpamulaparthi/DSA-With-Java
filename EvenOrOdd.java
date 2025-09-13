import java.util.*;
public class EvenOrOdd {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a%2==0)
    System.out.println("It is even so"+a/2);
else
    System.out.println("It is Odd so"+a*2);
  }  
}
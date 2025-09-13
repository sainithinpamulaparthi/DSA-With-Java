import java.util.*;
public class second{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of days: ");
int n=sc.nextInt();

int years=n/365;
int months=(n%365)/30;
int weeks=((n%365)%30)/7;
int days=(((n%365)%30)%7);
System.out.println(years+"years "+months+"months "+weeks+"weeks "+days+"days");
  }  
}
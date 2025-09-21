import java.util.*;
public class forth{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter marks ");
int m=sc.nextInt();
if(m>=91 && m<=100)
System.out.println("O");
else if(m>=81 && m<=90)
System.out.println("A");
else if(m>=71 && m<=80)
System.out.println("B");
else if(m>=61 && m<=70)
System.out.println("C");
else if(m>=51 && m<=60)
System.out.println("D");
else if(m>=36 && m<=50)
System.out.println("E");
else if(m>=0 && m<=35)
System.out.println("Fail");
else
System.out.println("Invalid");
sc.close(); 
}  
}
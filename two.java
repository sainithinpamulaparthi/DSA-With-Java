import java.util.*;
class two{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int x= sc.nextInt();
int y= sc.nextInt();
int z= sc.nextInt();
if((x+y)<=z)
System.out.println(1);
else if(x<=z)
System.out.println(2);
else
System.out.println(0);
   sc.close();
 }
}
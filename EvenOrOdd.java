import java.util.*;
public class EvenOrOdd {

    static void evenorodd(int a){
  if(a%2==0)
    System.out.println(a+" is even ");
else
    System.out.println(a+" is Odd ");
}


static int qwer(int x){
    if(x==1)
        return 1;
    if(x==2)
        return 2;
    if(x%2==0)
       return qwer(x-1)+qwer(x-2);
    else 
       return qwer(x-1)+x;
}
static int  sumarr(int arr[],int n,int sum){
  if(n==-1)
    return sum;
 //sum+=arr[n];
  //return sumarr(arr,n-1,sum);
  return sumarr(arr,n-1,sum+arr[n]);
}
static int sumall(int arr[],int n){
    if(n==-1)
        return 0;
    return sumall(arr,n-1) + arr[n];
}


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
// System.out.print(qwer(9));
//evenorodd(a);


int arr[]={3,4,5,6,7,2};
int n=arr.length;
//int sum=0;
//System.out.println(sumarr(arr, n-1, 0));

System.out.println(sumall(arr,n-1));










//int a=sc.nextInt();
/**if(a%2==0)
    System.out.println("It is even so"+a/2);
else
    System.out.println("It is Odd so"+a*2);*/

sc.close();
}  
}
import java.util.*;
public class Eight {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
/*
//array intialize
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
System.out.println(Arrays.toString(arr));
/*
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}*/

//System.out.println(arr);
//int[] arr=/*new int[5];*/{4,5,7,8,9,1,2,3,6};
//arr[0]=100;
//int[] arr1=Arrays.copyOf(arr,arr.length);
//int[] arr1=Arrays.copyOfRange(arr,3,8);
//arr[1]=20;
//Arrays.fill(arr,-1);
//Arrays.sort(arr);
/*System.out.println(Arrays.toString(arr));
int[] res=new int[arr.length];
for(int i=(arr.length)-1;i>=0;i--){ 
   res[(arr.length)-i-1]=arr[i];
   System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println(Arrays.toString(res));

//array in descending order
for(int i=0;i<n/2;i++){

   int t=arr[i];
   arr[i]=arr[n-i-1];
   arr[n-i-1]=t;
}
System.out.println(Arrays.toString(arr));


//method 1
//sum of some elements in an array
int n=sc.nextInt();//array size
int[] arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}//array elements
int t=sc.nextInt();//no. of test cases
while(t!=0){
int x=sc.nextInt();//from index
int y=sc.nextInt();//to index
int sum=0;
for(int i=x;i<=y;i++){
    sum+=arr[i];
}
System.out.println("sum: "+sum);
t--;
}


//method 2
int n=sc.nextInt();//array size
int[] arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
int[] pf=new int[n];
pf[0]=arr[0];
for(int i=1;i<n;i++){
pf[i]=arr[i]+pf[i-1];
}
int t=sc.nextInt();
while(t!=0){
    int x=sc.nextInt();
    int y=sc.nextInt();
    System.out.println(pf[y]-pf[x-1]);
    t--;
}

//reverse an array
int n=sc.nextInt();//array size
int[] arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
for(int i=0;i<n/2;i++){
   int t=arr[i];
   arr[i]=arr[n-i-1];
   arr[n-i-1]=t;
}
System.out.println(Arrays.toString(arr));
*/

//print sum of even numbers in an array
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<n;i++){
    if(arr[i]%2==0)
    sum+=arr[i];
}
 System.out.print("sum of even numbers"+sum);



sc.close();
}
}

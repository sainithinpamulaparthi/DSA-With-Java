import java.util.*;
class Selection{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        /***
        //selection sort

        for(int i=0;i<n-1;i++){
            int min=arr[i];
            int midx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<min){
                min=arr[j];
                midx=j;
            }
          }
            int t=arr[i];
            arr[i]=arr[midx];
            arr[midx]=t;
        }*/

        //insertion sort

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        System.out.print(Arrays.toString(arr));
    }
}
/***
   O(1)     =  CONSTANT
   O(n)     =  LINEAR
   O(n*n)   =  QUADRATIC
   O(logn)  =  LOGARITHMIC
   O(nlogn) =  QUAZI
   O(2^n)   =  EXPONENTIAL

 */

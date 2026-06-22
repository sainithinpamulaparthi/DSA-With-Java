import java.util.*;

public class Arrays2d {
    static void rev(int[] arr,int l,int r){
        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
    }

    static void trp(int[][] arr,int n){
        for(int i=0;i<n-1;i++){
    for(int j=i+1;j<n;j++){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    }
    }
    
    static void rev1(int[][] arr,int n){
      for(int i=0;i<n;i++){
        for(int j=0;j<n/2;j++){
          int t=arr[i][j];
          arr[i][j]=arr[i][n-j-1];
          arr[i][n-j-1]=t;
      }
    }
    }

    static void rev2(int[][] arr,int n){
      for(int i=0;i<n;i++){
        for(int j=0;j<n/2;j++){
          int t=arr[i][j];
          arr[i][j]=arr[j][n-i-1];
          arr[j][n-i-1]=t;
      }
    }
    }
    

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      /*int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int k=sc.nextInt();//how many elements to be rotate
      k=k%n;
      int x=sc.nextInt();//choose clock or anti-clock direction

      if(x==1){             //clock wise
      rev(arr,0,n-1);
      rev(arr,0,k-1);
      rev(arr,k,n-1);
       }

      if(x==2) {
        rev(arr,0,k-1);     //anti-clock  (or)  counter-clock
       rev(arr,k,n-1);
       rev(arr,0,n-1);
      }
      System.out.print(Arrays.toString(arr));


int n=sc.nextInt();
int[][] arr=new int[n][n];
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
    }
}
trp(arr,n);
System.out.println("After transpose");
for(int i=0;i<n;i++){                                        //2darray transpose
    for(int j=0;j<n;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}

     /* Arrays.sort(arr);
      int[] res=new int[n];
      int k=0;
      for(int i=0;i<n-1;i++){
        if(arr[i]!=arr[i+1])
        res[k++]=arr[i];
      }
      if(arr[n-1]!=arr[n-2]){
        res[k++]=arr[n-1];
      }
      
      Arrays.sort(arr);
      int[] res=new int[n];
      int k=0;
      res[k++]=arr[0];
      for(int i=1;i<n;i++){
        if(arr[i]!=arr[i-1])
        res[k++]=arr[i];
      }
      System.out.println(Arrays.toString(Arrays.copyOfRange(res,0,k)));
      //System.out.println(Arrays.toString(res));


   int n=sc.nextInt();
int[][] arr=new int[n][n];
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
    }
}
trp(arr,n);
for(int i=0;i<n;i++){
   rev1(arr,n);
}
System.out.println("After 90 degree rotate");

for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
*/

   int n=sc.nextInt();
int[][] arr=new int[n][n];
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
    }
}
trp(arr,n);
for(int i=0;i<n;i++){
   rev1(arr,n);
}
for(int i=0;i<n;i++){
   rev2(arr,n);
}

System.out.println("After 180 degree rotate");
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}










       sc.close(); 
    }
}

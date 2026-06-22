import java.util.*;
public class Stringspractice {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
     // String str=sc.nextLine();

/*
      int  count=0;
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
          count++;
    }
      System.out.println(count);


        String s1="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            s1+=ch;
        }
        System.out.println(s1);


        int lc=0,uc=0,di=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
        if(ch>=65 && ch<=90)                   // if(ch>='a'&&ch<='z')
            lc++;
            else if(ch>=97 && ch<=122)         //else if(ch>='A'&&ch<='Z')
            uc++;
            else if (ch >= 48 && ch <= 57)     //else if (ch >= '0' && ch <= '9')
            di++;
        }
        System.out.println(lc+" "+uc+" "+di);


        int[] arr=new int [str.length()];
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-96;
        }
        System.out.println(Arrays.toString(arr));


          int n=sc.nextInt();
          int[] arr=new int [n];
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }
          String res="";
        for(int i=0;i<n;i++){
            res= res + (char) (arr[i]+96);
        }
        System.out.println(res);

        String str=sc.nextLine();
        int k=sc.nextInt();
        String res="";
        for(int i=0;i<str.length();i++){ 
            if(str.charAt(i)-k >= 97)
            res = res + (char) (str.charAt(i)-k);
            else
            res = res + (char) (str.charAt(i)- k + 26);
        }
        System.out.println(res);


        String s1=sc.nextLine();
        int count=1;
        String res="";
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i)==s1.charAt(i+1))
                count++;
            else {
                res+=s1.charAt(i)+count;
                count=1;
            }
        }
        res+=s1.charAt(s1.length()-1)+count;
        System.out.println(res);
*/

       String str=sc.nextLine();
       if(str.length()>=8 ){
       int u=0,l=0,d=0,sp=0;
       for(int i=0;i<str.length();i++){
       char ch=str.charAt(i);
       if(ch >= 65 && ch <= 90)          //if(Character.isUpperCase(ch))
       u=1;
       else if(ch >= 97 && ch <= 122)    //else if(Character.isLowerCase(ch))
       l=1;
       else if(ch >= 48 && ch <= 57)     //else if(Character.isDigit(ch))
       d=1;
       else
       sp=1;
       }
       if(u + l + d + sp == 4)
       System.out.println("Valid");
       else
       System.out.println("Invalid!!");
      }
      else
      System.out.println("Invalid!!");










sc.close();
    }
}

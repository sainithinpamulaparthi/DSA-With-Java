import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String str="hello";                         //Strings are immutable (don't change)
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.indexOf("el"));
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.replace("l","p"));
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(1,4));
        
        String s1="hello";
        String s2="Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3="    hi     ";
        System.out.println(s3);
        System.out.println(s3.trim());

        String s4="hey all how are you";
        System.out.println(s4.split(" "));
        System.out.println(Arrays.toString(s4.split(" ")));
        System.out.println(Arrays.toString(s4.split("a")));
        System.out.println(s4.split(" ").length);



    }
}

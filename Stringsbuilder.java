public class Stringsbuilder {
    public static void main(String[] args) {

        StringBuilder str=new StringBuilder("hello");
        System.out.println(str);
        str.append("123");
        //System.out.println(str.append("123"));      //steingbuilder are mutable(changeble)
         System.out.println(str);           //here str changed
         
         str.insert(5,"abc");
         System.out.println(str);
         str.reverse();
         System.out.println(str);


         StringBuilder str1=new StringBuilder("hey java coder");
         System.out.println(str1);
         str1.replace(4,8,"python");
         System.out.println(str1);
    }
}

class Test{
    String name;
    int age;
    double marks;
    static String cname="ACE";
    Test(String n,int a, double m){
        this.name=n;
        this.age=a;
        this.marks=m;
    }
    void display(){ 
        String cname="iit";
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
        System.out.println(Test.cname);
        
        
    }
    public static void main(String xyz[]){
        int a=10;
        Test t1=new Test("charan",25,95.5);
        Test t2=new Test("arjun",27,35.5);
        t1.display();
        t2.display();
    }
}
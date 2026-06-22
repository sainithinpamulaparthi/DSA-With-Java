import java.util.HashMap;

public class hashmap2 {
    public static void main(String[] args) {
         HashMap<Integer,Integer> hm=new HashMap<>();

        hm.put(5,10);
        hm.put(3,40);
        hm.put(7,20);
        System.out.println(hm);
        System.out.println(hm.get(7));
        hm.remove(7);
        System.out.println(hm);
        System.out.println(hm.get(7));//null (key is not present)
        System.out.println(hm.containsKey(3));//boolean value
        System.out.println(hm.size());
        System.out.println(hm.containsValue(10));//boolean for value


        hm.put(5,10);
        hm.put(3,40);
        hm.put(7,20);
        hm.put(6,30);
        hm.put(2,50);
        hm.put(1,60);

        for(Integer k  :  hm.keySet())
        {
            System.out.println(k+" - "+hm.get(k));
        }
    }
    
}

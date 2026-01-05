import java.util.*;
public class frequencyinarray {
    public static void main(String[] args) { 
        int[] arr={3,5,4,6,3,5,5,6,6,6};
        HashMap<Integer,Integer> hm= new HashMap<>();
        //int n=arr.length;
        for(int i : arr){
           /*** if(hm.containsKey(i)==false)
                    hm.put(i,1);
                else
                    hm.put(i,hm.get(i)+1);*/

            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        //System.out.println(hm);


        //System.out.println(hm.getOrDefault(15,0));

        int key=0,max=0;
        for(Integer k  :  hm.keySet())
        {
            if(max<hm.get(k)){
                max=hm.get(k);
                key=k;
            }
            //System.out.println(k+" - "+hm.get(m));
            }
            hm.remove(key);

            max=0;
            
              for(Integer k  :  hm.keySet())
        {
            if(max<hm.get(k)){
                max=hm.get(k);
                key=k;
            }
            //System.out.println(k+" - "+hm.get(m));
        }
        System.out.println(key);
        
       
    }
    }


// Problem 9
import java.util.*;
class p9 {
    List<int[]> find(int[] a,int t){
        HashMap<Integer,Integer> m=new HashMap<>();
        List<int[]> r=new ArrayList<>();
        for(int x:a){
            if(m.containsKey(t-x)) r.add(new int[]{x,t-x});
            m.put(x,1);
        }
        return r;
    }
}
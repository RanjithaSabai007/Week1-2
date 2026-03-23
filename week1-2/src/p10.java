// Problem 10
import java.util.*;
class p10 {
    LinkedHashMap<String,String> L1=new LinkedHashMap<>(16,0.75f,true){
        protected boolean removeEldestEntry(Map.Entry e){return size()>10000;}
    };
    HashMap<String,String> L2=new HashMap<>();

    String get(String k){
        if(L1.containsKey(k)) return L1.get(k);
        if(L2.containsKey(k)){
            String v=L2.get(k); L1.put(k,v); return v;
        }
        String d="DATA";
        L2.put(k,d); return d;
    }
}
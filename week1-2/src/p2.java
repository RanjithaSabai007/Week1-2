// Problem 3
import java.util.*;
class p3 {
    class E{
        String ip; long exp;
        E(String i,long t){ip=i;exp=System.currentTimeMillis()+t;}
    }
    LinkedHashMap<String,E> map=new LinkedHashMap<>(16,0.75f,true){
        protected boolean removeEldestEntry(Map.Entry e){return size()>100;}
    };

    String resolve(String d){
        if(map.containsKey(d)){
            E e=map.get(d);
            if(System.currentTimeMillis()<e.exp) return e.ip;
            map.remove(d);
        }
        String ip="1.1.1.1";
        map.put(d,new E(ip,300000));
        return ip;
    }
}
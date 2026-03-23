// Problem 7
import java.util.*;
class p7 {
    class T{HashMap<Character,T> c=new HashMap<>(); boolean e;}
    T root=new T();
    HashMap<String,Integer> f=new HashMap<>();

    void insert(String s){
        f.put(s,f.getOrDefault(s,0)+1);
        T t=root;
        for(char ch:s.toCharArray())
            t=t.c.computeIfAbsent(ch,k->new T());
        t.e=true;
    }

    List<String> search(String p){
        List<String> r=new ArrayList<>();
        for(String k:f.keySet()) if(k.startsWith(p)) r.add(k);
        r.sort((a,b)->f.get(b)-f.get(a));
        return r.subList(0,Math.min(10,r.size()));
    }
}
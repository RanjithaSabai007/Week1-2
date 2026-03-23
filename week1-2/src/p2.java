// Problem 2
import java.util.*;
import java.util.concurrent.*;
class p2 {
    ConcurrentHashMap<String,Integer> stock = new ConcurrentHashMap<>();
    ConcurrentHashMap<String,Queue<Integer>> wait = new ConcurrentHashMap<>();

    void add(String id,int c){
        stock.put(id,c);
        wait.put(id,new ConcurrentLinkedQueue<>());
    }

    synchronized String buy(String id,int u){
        int s=stock.getOrDefault(id,0);
        if(s>0){stock.put(id,s-1);return "OK";}
        wait.get(id).add(u);return "WAIT";
    }

    int check(String id){return stock.getOrDefault(id,0);}
}

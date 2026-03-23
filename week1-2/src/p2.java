// Problem 5
import java.util.*;
class p5 {
    HashMap<String,Integer> views=new HashMap<>();
    HashMap<String,Set<String>> users=new HashMap<>();
    HashMap<String,Integer> src=new HashMap<>();

    void process(String u,String user,String s){
        views.put(u,views.getOrDefault(u,0)+1);
        users.computeIfAbsent(u,k->new HashSet<>()).add(user);
        src.put(s,src.getOrDefault(s,0)+1);
    }

    List<String> top(){
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->views.get(a)-views.get(b));
        for(String k:views.keySet()){
            pq.add(k); if(pq.size()>10) pq.poll();
        }
        return new ArrayList<>(pq);
    }
}
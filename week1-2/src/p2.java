// Problem 4
import java.util.*;
class p4 {
    HashMap<String,Set<Integer>> map=new HashMap<>();

    void index(int id,String t){
        String[] w=t.split(" ");
        for(int i=0;i+4<w.length;i++){
            String g=String.join(" ",Arrays.copyOfRange(w,i,i+5));
            map.computeIfAbsent(g,k->new HashSet<>()).add(id);
        }
    }

    int compare(String t,int id){
        String[] w=t.split(" ");
        int c=0;
        for(int i=0;i+4<w.length;i++){
            String g=String.join(" ",Arrays.copyOfRange(w,i,i+5));
            if(map.containsKey(g)&&map.get(g).contains(id)) c++;
        }
        return c;
    }
}
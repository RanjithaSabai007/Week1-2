// Problem 1
import java.util.*;
class p1 {
    HashMap<String,Integer> users = new HashMap<>();
    HashMap<String,Integer> freq = new HashMap<>();

    boolean checkAvailability(String u){
        freq.put(u,freq.getOrDefault(u,0)+1);
        return !users.containsKey(u);
    }

    List<String> suggest(String u){
        return Arrays.asList(u+"1",u+"2",u+"3",u.replace("_","."));
    }

    String getMostAttempted(){
        return Collections.max(freq.entrySet(),Map.Entry.comparingByValue()).getKey();
    }
}
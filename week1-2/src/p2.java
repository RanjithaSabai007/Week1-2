// Problem 6
import java.util.*;
class p6 {
    class B{int t; long l; B(int m){t=m;l=System.currentTimeMillis();}}
    HashMap<String,B> map=new HashMap<>();
    int max=1000,rate=1000;

    synchronized boolean allow(String id){
        map.putIfAbsent(id,new B(max));
        B b=map.get(id);
        long now=System.currentTimeMillis();
        int refill=(int)((now-b.l)/3600000.0*rate);
        b.t=Math.min(max,b.t+refill);
        b.l=now;
        if(b.t>0){b.t--;return true;}
        return false;
    }
}
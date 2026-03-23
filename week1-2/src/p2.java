// Problem 8
class p8 {
    String[] t; int n;
    p8(int n){this.n=n;t=new String[n];}
    int h(String s){return Math.abs(s.hashCode())%n;}

    int park(String p){
        int i=h(p);
        while(t[i]!=null) i=(i+1)%n;
        t[i]=p; return i;
    }

    void exit(String p){
        int i=h(p);
        while(t[i]!=null){
            if(t[i].equals(p)){t[i]=null;return;}
            i=(i+1)%n;
        }
    }
}
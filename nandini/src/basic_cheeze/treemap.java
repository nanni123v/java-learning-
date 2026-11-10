import java.util.*;

public class treemap{
    public static void main(String args[]){

        NavigableMap<Integer,String> ref = new TreeMap<Integer,String>();
        ref.put(1,"A");
        ref.put(2,"B");
        ref.put(3,"C");
        ref.put(4,"D");
        ref.put(5,"E");
        ref.put(6,"F");
        ref.put(7,"G");
        ref.put(8,"H");
        ref.put(9,"I");
        System.out.println("celling value : "+ref.ceilingKey(5));
        System.out.println("celling value : "+ref.ceilingKey(18));// Null

    }
}
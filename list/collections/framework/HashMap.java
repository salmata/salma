package list.collections.framework;
import methodclass.Math;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
Key-value paired, key can't be duplicate.
get(Object KEY) – This will return the value
associated with a specified key in this Java hashmap.
put(Object KEY, String VALUE) – This method stores
the specified value and associates it with the specified key in this map.
 // public Map<Integer, String> getHasmap() {
       // return hasmap; // public Map<Integer, String> getHasmap() {
            // return hasmap;
*/
public class HashMap {
    public static void main(String[] args) {

        Map<Integer, String> hasmap = new java.util.HashMap<>();
hasmap.put(1,"Mozammel");
hasmap.put(2,"Abdel");
hasmap.put(3,"Alma");
hasmap.put(4,"Jahid");

Set set= hasmap.entrySet();
        Iterator iterator = ((Set) set). iterator();
        while (iterator.hasNext());
        Map.Entry entry = (Map.Entry) iterator.next();
        System.out.println(" key is" + entry.getKey()+ entry.getValue());
    }

}


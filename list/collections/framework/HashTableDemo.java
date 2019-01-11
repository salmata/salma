package list.collections.framework;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        /*
         * When need thread safe application, need to have synchronised class
         * HashTable is synchronised and thread safe
         * HashMap is not Synchronisd
         */
        Map<String, String> hashTable = new Hashtable<String,String>();
        hashTable.put("CEO" , "Mozammel ");
        hashTable.put("MD1", " Abdel");
        hashTable.put("MD2", "Salma");
        hashTable.put("MD3", "Alma");

        Set<String> keys = hashTable.keySet();
        for (String key: keys){
            System.out.println(key + " " + hashTable.get(key));

        }
        /*
        Access data from Hashset using foreach () meyhod
         */

        hashTable.forEach((( key, value)->System.out.println(" key" + key + "value" + value)));

    }
}

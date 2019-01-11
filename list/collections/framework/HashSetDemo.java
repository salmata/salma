package list.collections.framework;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String>hashSet = new HashSet<>();
        hashSet.add("Mozammel");
        hashSet.add("Abdel");
        hashSet.add("Salma");
        hashSet.add("Alma");
        hashSet.add("Alma");
        hashSet.add("Null");
        System.out.println(hashSet);
        /*
        Access data from Hashset using forEach () method *******");
        */
        System.out.println("********Access data from HashSet using foreach() method*********");
        hashSet.forEach(name-> System.out.println(name));
        /*
        Access data from HashSet using foreach saatement
         */
    for (String st : hashSet){
        System.out.println(st);
    }

    }

}

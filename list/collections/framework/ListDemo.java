package list.collections.framework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        int x = 2;

        List<String> StudentsNameList = new ArrayList<>();
        StudentsNameList.add("Mozammel");
        StudentsNameList.add("Abdel");
        StudentsNameList.add("Salma");
        StudentsNameList.add("Alma");
        StudentsNameList.add("Jahid");

        StudentsNameList.add(1, "Jahid");

        StudentsNameList.remove(2);
        System.out.println("length/size of the array: " + StudentsNameList.size());
        for (String name: StudentsNameList){
            System.out.println(" Student name"+  name);
        }
       /* Accessing the elements from ArrayList by index number

         */

       //System.out.println("Element at index 0:"+ studentNameList.get(0));
       //System.out.println(" Element at index 1:"+ studentNAmelist.get(1));

       /* Accessing the elements of a list using foreach() method

         */
        System.out.println("*********Accessing elements of a list using foreach () method *********");
        //studentNamelist.forEach(student -> System.out.println("Student Name" + student));
        StudentsNameList.forEach(student-> System.out.println(student));
    }


}

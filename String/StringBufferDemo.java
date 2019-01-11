package String;

public class StringBufferDemo {
    /*
     * create a new string containing the characters
     * of the input string, but reversed
     */

    public static String reverse (String data) {
        StringBuffer temp = new StringBuffer();

        for ( int j = data.length()-1; j>=0; j--) // String fron R--> L
            temp.append(data.charAt(j)); // append characters on the right
        return temp.toString(); // return a String created from the StringBuffer
    }

    public static void main(String[] args) {
        System.out.println( reverse("Hello"));
        System.out.println("Obj Empty String" + new String("Hi"));
    }
}

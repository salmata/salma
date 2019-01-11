package String;

public class Immutable {
    public static void mysteryMethod(String data) {

    }

    public static void main(String[] args) {
        String str = new String("An Immutable String");
        str.length();
        /*
        *append is not possible
        * only can create new String referance variable
        */
        System.out.println(" String object: " + str);
        StringBuffer stringBuffer = new StringBuffer(" StringBuffer is");
        System.out.println(" StringBuffer String object: "+ stringBuffer);

        /*
        *Add/append String to stringBuffer referance variable
        *
        *
        */

        stringBuffer.length();
        stringBuffer.append("mutable");
        System.out.println("After appending the stringBuffer referance variable: " + stringBuffer);
        stringBuffer.replace(0,1, " TT");
        System.out.println( stringBuffer);

        /*
        mysteryMethod( str );
        System.out.println( str);
         */

    }

}

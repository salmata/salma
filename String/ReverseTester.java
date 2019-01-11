package String;

public class ReverseTester {
    public static String reverse ( String data) {
        String rev = new String();
        for ( int j=data.length()-1; j>=0; j--)
            rev = rev + data.charAt(j);
        return rev;

    }

    public static void main(String[] args) {
        String reverseString = reverse("Hello");
        System.out.println( reverseString);

        char[] array = reverseString.toCharArray();
        for( int i = array.length -1; i>=0; i --){
            char ch = array[i];
            System.out.println(ch);
        }
    }
}

package arraydemo;

public class CopyArray {
    public static void main(String[] args) {
        char [] source = { 'a', 'r', 'r', 'a', 'y'
        };
        char [] target = new char [7];
       int i = 0;
        while (i<source.length)
        {
            target[i] = source[i];
            i++;
        }
        System.out.println( source);
        System.out.println( target);

    }
}

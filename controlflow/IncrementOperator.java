package controlflow;

public class IncrementOperator {
    public static void main (String[]args){
        int x=1;
        x = x++ + ++x + x++ + ++x + ++x;
        System.out.print(x);
    }

}


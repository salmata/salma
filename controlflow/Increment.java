package controlflow;

public class Increment {
    public static void main(String args[]){
        int x,y;
        x=10;
        y=x++ +10;

        System.out.println("Before x++: value of x =" + x);
        System.out.println("After x++: value of x ="+x);
        System.out.println("y ="+y);
        System.out.println("Before x--: value of x =" + x);
        System.out.println("After x--: value of x =" +x);

    }
}

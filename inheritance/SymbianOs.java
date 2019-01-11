package inheritance;

import com.sun.jdi.Method;
   /*A class having at least one unimplemented method
    is calledabstract class
   */

public abstract class SymbianOs implements Mobile {


    @Override
    public void makeCall() {
        System.out.println("This will call");

    }

    @Override
    public void sendText() {
        System.out.println("This will make call");

    }
    public abstract void developDisplay();
    public abstract void removeAntenna();

}

package inheritance;

public class NokiaAndroidPhone extends NokiaSymbianPhone {

    public void createAndroidApp() {
        System.out.println("Android App");

    }
    public void touchScreen(){
        System.out.println(" Touch Screen");

    }

  //  public void callMethod(){

    public static void main(String[] args) {


        NokiaAndroidPhone obj = new NokiaAndroidPhone();
        obj.developDisplay();
    }
}

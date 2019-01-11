package inheritance;

/*
"IMPOTANT"

in a overridden method you can change method body
but cant change method signature(parameter)

Override happens between two classes with same name & same
signature method

Method overloade happens in same class with same method
having different signature
 */

import kotlin.jvm.JvmOverloads;

public class SamsungPhone extends NokiaAndroidPhone {

   @Override
    public void createAndroidApp (){
       System.out.println(" Implements new App");

    }

   @JvmOverloads
    public void developAiApp(){
        System.out.println("Develop AI App");
    }

    public void developAiApp(String advancedApp){
        System.out.println("Develop AI App");
    }

    public static void main(String[] args) {
        SamsungPhone obj = new SamsungPhone();
        obj.createAndroidApp();
        obj.developDisplay();
        obj.makeCall();
    }
}

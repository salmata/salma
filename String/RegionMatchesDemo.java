package String;

import com.sun.org.apache.xpath.internal.operations.String;

public class RegionMatchesDemo {
    public static void main(String[] args) {
        /*
         * regionMatches() method of String
         */
        java.lang.String searchMe = " Green Eggs and Ham";
        java.lang.String findMe = " Eggs";

        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();
        boolean foundIt = false;

        for ( int i= 0; i<= ( searchMeLength - findMeLength); i ++){
            if ( searchMe.regionMatches(i,findMe,0,findMeLength)){
                foundIt = true;
                System.out.println(searchMe.substring(i,i + findMeLength));
                break;
            }
        }
if ( ! foundIt){
    System.out.println(" No match found ");
}
    }

}

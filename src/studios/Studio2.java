package studios;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Studio2 {
    public static void main(String[] args){
        String input = "If the product of two terms is zero then common se" +
                "nse says at least one of the two terms has to be zero to " +
                "start with. So if you move all the terms over to one side" +
                ", you can put the quadratics into a form that can be fact" +
                "ored allowing that side of the equation to equal zero. On" +
                "ce you’ve done that, it’s pretty straightforward from there.";

        char[] chars = input.toCharArray();

        HashMap<Character, Integer> result = new HashMap<>();

        for (char c : chars) {
            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> i : result.entrySet()){
            System.out.println( i.getKey() + ": " + i.getValue() );
        }
    }
}

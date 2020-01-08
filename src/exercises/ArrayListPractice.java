package exercises;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            a.add(i);
        }

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
        ArrayList<String> s = new ArrayList<>();
        String[] strArr = str.split(" ");

        Collections.addAll(s, strArr);

        printWords(s);

        System.out.println(getSum(a));
    }
    public static int getSum(ArrayList<Integer> a){
        int sum = 0;
        for (Integer o : a) {
            sum += o;
        }
        return sum;
    }

    public static void printWords(ArrayList<String> a){
        for (String o : a) {
            if ( o.length() == 5) {
                System.out.println(o);
            }
        }


    }
}

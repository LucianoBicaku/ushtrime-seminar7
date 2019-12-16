import java.util.ArrayList;//kjo eshte per arraylist
import java.util.Collections;//kjo eshte per sort e arraylist

public class ushtrimi1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(i + 1);
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        Collections.shuffle(arr);
        for (int i = 0; i < 10; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
import java.util.ArrayList;//kjo eshte per arraylist
import java.util.Collections;//kjo eshte per sort e arraylist

public class ushtrimi3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(4);
        arr.add(9);
        arr.add(16);
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr.add(4);
        arr.add(9);
        arr.add(9);
        arr.add(7);
        arr.add(11);

        arr.addAll(arr1);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
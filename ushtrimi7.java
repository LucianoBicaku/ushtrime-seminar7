import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class ushtrimi7 {
    public static void main(String[] args) {
        ArrayList<String> arr = mbush();
        ArrayList<String> arr1 = mbush();
        System.out.println(arr);
        System.out.println(arr1);
        ArrayList<String> arrMerged = Merge(arr1, arr);
        System.out.println(arrMerged);
        System.out.println(MergeWithDup(arrMerged));
    }

    public static ArrayList<String> mbush() {
        ArrayList<String> arr = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String elem;
        do {
            elem = in.next();
            if (elem.equals("-1")) {
                break;
            }
            arr.add(elem);
        } while (true);
        return arr;
    }

    public static ArrayList<String> Merge(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> al = new ArrayList<String>();
        al.addAll(list1);
        al.addAll(list2);
        return al;
    }

    public static ArrayList<String> MergeWithDup(ArrayList<String> temp) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(temp);
        return new ArrayList<>(hashSet);
    }
}
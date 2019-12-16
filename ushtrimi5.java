
import java.util.ArrayList;
import java.util.Scanner;

public class ushtrimi5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        int index1 = in.nextInt();
        int index2 = in.nextInt();

        arr.subList(index1, index2).clear();
        System.out.println(arr);
        in.close();
    }
}
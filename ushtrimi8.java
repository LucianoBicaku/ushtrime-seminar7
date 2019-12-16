import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ushtrimi8 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String elem;
        do {
            elem = in.next();
            if (elem.equals("-1")) {
                break;
            }
            arr.add(elem);
            Collections.sort(arr);
            System.out.println(arr);
        } while (true);

        in.close();
    }
}
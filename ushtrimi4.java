import java.util.ArrayList;//kjo eshte per arraylist

public class ushtrimi4 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Lool");
        arr.add("lool");
        arr.add("kot");
        arr.add("Test");
        arr.add("YEES");
        int n = arr.size();
        for (String x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                if (Character.isUpperCase(arr.get(j).charAt(0))) {
                    String a = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, a);
                }
            }
        }
        for (String x : arr) {
            System.out.print(x + " ");
        }
    }
}
import java.util.ArrayList;//kjo eshte per arraylist

public class ushtrimi2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(0);
        arr1.add(99);
        arr1.add(12);
        arr1.add(1);

        ArrayList<Integer> mergedArray = new ArrayList<Integer>();
        int gjat;
        if (arr.size() < arr1.size()) {
            gjat = arr.size();
        } else
            gjat = arr1.size();

        for (int i = 0; i < gjat; i++) {
            mergedArray.add(arr.get(i));
            mergedArray.add(arr1.get(i));
        }
        if (arr.size() == gjat) {
            for (int i = 0; i < Math.abs(arr.size() - arr1.size()); i++) {
                mergedArray.add(arr1.get(gjat + i));
            }
        } else
            for (int i = 0; i < Math.abs(arr.size() - arr1.size()); i++) {
                mergedArray.add(arr.get(gjat + i));
            }
        for (int x : mergedArray) {
            System.out.print(x + " ");
        }
    }

}
import java.util.ArrayList;

public class Intersect {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for (int num : nums1) {
            l1.add(num);
        }
        for (int item : nums2) {
            if (l1.contains(item)) {
                l1.remove(Integer.valueOf(item));
                l2.add(item);
            }
        }

        int arr[] = new int[l2.size()];
        int i = 0;
        for (int item : l2) {
            arr[i++] = item;
        }
        return arr;
    }
}

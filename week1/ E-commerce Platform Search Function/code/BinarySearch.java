// BinarySearch.java
import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product search(Product[] products, String target) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(target);
            if (cmp == 0) return products[mid];
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}

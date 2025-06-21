// SearchTest.java
public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Book", "Stationery"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Pen", "Stationery")
        };

        System.out.println("🔍 Linear Search:");
        Product result1 = LinearSearch.search(products, "Phone");
        System.out.println(result1 != null ? "Found: " + result1 : "Not Found");

        System.out.println("\n🔎 Binary Search:");
        Product result2 = BinarySearch.search(products, "Phone");
        System.out.println(result2 != null ? "Found: " + result2 : "Not Found");
    }
}

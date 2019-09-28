
public class App {
    public static void main(String[] args) {
        Product[] arr = {new Product(123, 20, 3.4),
                new Product(234, 24, 3.64),
                new Product(1233, 64, 24),
                new Product(4315, 1, 82)};

        Product exp = ProductUtil.getExpensiveStock(arr);

        System.out.println(exp.getPrice());
    }
}

class Product {
    private int m_id, m_code, m_amount;
    private double m_price;

    private static int counter = 0;

    public Product(int code, int amount, double price) {
        m_id = counter++;
        m_code = code;
        m_amount = amount;
        m_price = price;
    }

    public double getPrice() {
        return m_price;
    }

    public int getStock() {
        return m_amount;
    }

    public int comparePrices(Object o) {
        Product other = (Product) o;

        return (int)(this.getPrice() - other.getPrice());
    }

    public int compareStock(Object o) {
        Product other = (Product) o;

        return (int) (this.getPrice() * this.getStock() - other.getPrice() * other.getStock());
    }
}

class ProductUtil {
    public static Product getExpensiveProduct(Product[] arr) {
        return Arrays.stream(arr)
                .max(Product::comparePrices)
                .get();
    }

    public static Product getCheapestProduct(Product[] arr) {
        return Arrays.stream(arr)
                .min(Product::comparePrices)
                .get();
    }

    public static Product getExpensiveStock(Product[] arr) {
        return Arrays.stream(arr)
                .max(Product::compareStock)
                .get();
    }

    public static Product getCheapestStock(Product[] arr) {
        return Arrays.stream(arr)
                .min(Product::compareStock)
                .get();
    }
}

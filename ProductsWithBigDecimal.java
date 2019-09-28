
class Product {
    private int m_id;
    private String m_code;
    private String m_name;
    private double m_stock;
    private BigDecimal m_price;

    public Product(int id, String code, String name, double stock, double price) {
        this(id, code, name, stock, BigDecimal.valueOf(price));
    }

    public Product(int id, String code, String name, double stock, BigDecimal price) {
        m_id = id;
        m_code = code;
        m_name = name;
        m_stock = stock;
        m_price = price;
    }

    public int getId() {
        return m_id;
    }

    public void setId(int id) {
        m_id = id;
    }

    public String getCode() {
        return m_code;
    }

    public void setCode(String code) {
        m_code = code;
    }

    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        m_name = name;
    }

    public double getStock() {
        return m_stock;
    }

    public void setStock(double stock) {
        m_stock = stock;
    }

    public BigDecimal getPrice() {
        return m_price;
    }

    public void setPrice(BigDecimal price) {
        m_price = price;
    }

    public int comparePrices(Object o) {
        Product other = (Product) o;

        return this.m_price.compareTo(other.m_price);
    }

    public int compareInventory(Object o) {
        Product other = (Product) o;

        return this.getInventory().compareTo(other.getInventory());
    }

    @Override
    public String toString() {
        return String.format("[%s]:%s:%f * %s = %s",
                m_code, m_name, m_stock, m_price, this.getInventory());
    }

    public BigDecimal getInventory() {
        return m_price.multiply(BigDecimal.valueOf(m_stock));
    }
}

class ProductUtil {
    static Product getMostExpensiveProduct(Product[] products) {
        return Arrays.stream(products)
                .max(Product::comparePrices)
                .get();
    }
    
    static Product getCheapestProduct(Product[] products) {
        return Arrays.stream(products)
                .min(Product::comparePrices)
                .get();
    }
    
    static Product getMostInventory(Product[] products) {
        return Arrays.stream(products)
                .max(Product::compareInventory)
                .get();
    }

    static Product getLeastInventory(Product[] products) {
        return Arrays.stream(products)
                .min(Product::compareInventory)
                .get();
    }
}

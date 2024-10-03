public class Product {
    private String productName;
    private String productID;
    private String productCategory;
    private String manufacturer;
    private String productImage;
    private String productDescription;
    private double originalPrice;
    private double salePrice;
    private int totalQuantity;

    public Product(String productName, String productID, String productCategory, String manufacturer, String productImage, String productDescription, double originalPrice, double salePrice, int totalQuantity) {
        this.productName = productName;
        this.productID = productID;
        this.productCategory = productCategory;
        this.manufacturer = manufacturer;
        this.productImage = productImage;
        this.productDescription = productDescription;
        this.originalPrice = originalPrice;
        this.salePrice = salePrice;
        this.totalQuantity = totalQuantity;
    }

    public String getProductID() {
        return this.productID;
    }
    public String getProductName() {
        return this.productName;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }
}

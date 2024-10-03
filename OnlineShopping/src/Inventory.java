import java.io.*;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public void updateProduct(Product oldProduct, Product newProduct) {
        int index = this.products.indexOf(oldProduct);
        if (index != -1) {
            this.products.set(index, newProduct);
        }
    }

    public Product getProduct(String productID) {
        for (Product product : this.products) {
            if (product.getProductID().equals(productID)) {
                return product;
            }
        }
        return null;
    }
    public ArrayList<Product> searchProducts(String keyword) {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product product : this.products) {
            if (product.getProductName().contains(keyword) ||
                    product.getProductCategory().contains(keyword) || product.getManufacturer().contains(keyword)) {
                result.add(product);
            }
        }
        return result;
    }

    public ArrayList<Product> filterProductsByCategory(String category) {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product product : this.products) {
            if (product.getProductCategory().equals(category)) {
                result.add(product);
            }
        }
        return result;
    }
    public void saveProductsToFile(String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.products);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void loadProductsFromFile(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.products = (ArrayList<Product>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
    }

}
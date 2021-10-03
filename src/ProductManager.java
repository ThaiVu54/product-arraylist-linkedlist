import java.util.LinkedList;

public class ProductManager {
    private LinkedList<Product> products;

    public ProductManager(){
        products = new LinkedList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public Product getProduct(String id){
        Product fix = null;
        for (Product product: products){
            if (product.getId().equals(id)){
                fix = product;
            }
        }
        return fix;
    }
    public Product removeProduct(String id){
        Product remove = null;
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).equals(getProduct(id))){
                remove = products.remove(i);
            }
        }
        return remove;
    }
    public Product searchProduct(String name){
        Product search = null;
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getName().equals(name)){
                search = products.get(i);
            }
        }
        return search;
    }
}

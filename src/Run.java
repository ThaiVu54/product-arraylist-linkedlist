import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Product product = new Product("quan", "Quan bo", 25);
        Product product1 = new Product("ao", "Ao thun", 35);
        Product product2 = new Product("phukien", "Khuyen tai", 55);

        ProductManager xuan = new ProductManager();
        xuan.addProduct(product);
        xuan.addProduct(product1);
        xuan.addProduct(product2);

        System.out.println(xuan.searchProduct(exitProduct(xuan.getProduct("ao"))));
    }
    public static String exitProduct(Product product){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new name");
        String newName = input.nextLine();
        System.out.println("Enter new price");
        int newprice = input.nextInt();
        product.setName(newName);
        product.setPrice(newprice);
        return newName;
    }
}

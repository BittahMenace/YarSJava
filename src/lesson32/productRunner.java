package lesson32;

import java.util.ArrayList;

public class productRunner {
    public static void main(String[] args) {
//        Product products[] = new Product[10];
        ArrayList<Product> products = new ArrayList<>();

        Product someProduct = new Product();
        Product secodProduct = new Product();
        Product thirdProduct = someProduct;

        someProduct.setPrice(69000);

        products.add(someProduct);
        products.add(secodProduct);
        products.add(thirdProduct);
        products.add(new Product());

        System.out.println(products.get(0));
        System.out.println(products.size());

        for(Product product : products){
            System.out.println(product);
        }



//
//        System.out.println(someProduct.toString());
//        System.out.println(secodProduct);
//        System.out.println(thirdProduct);

    }
}

package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("testcikolata", 25, "Deneme", "Beyaz");
        products[1] = new Coke("testKola", 30, "deneme", "Şekerli");
        products[2] = new Bread("testEkmek", 12, "deneme", "150 Gram");
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(int i=0;i<products.length;i++){
            products[i].showDetails();
        }
    }
}
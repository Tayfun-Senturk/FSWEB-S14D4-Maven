package org.example.model;

public class Bread extends ProductForSale{
    private String gram;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, String gram) {
        super(type, price, description);
        this.gram = gram;
    }

    @Override
    public void showDetails() {
        System.out.println("Tip: "+ getType()+" Fiyat: "+getPrice()+" Açıklama: "+getDescription()+ " gramaj: "+gram);
    }
}

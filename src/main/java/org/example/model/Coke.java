package org.example.model;

public class Coke extends ProductForSale{
    private String sugar;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, String sugar) {
        super(type, price, description);
        this.sugar = sugar;
    }

    @Override
    public void showDetails() {
        System.out.println("Tip: "+ getType()+" Fiyat: "+getPrice()+" Açıklama: "+getDescription()+ " şeker: "+sugar);
    }
}

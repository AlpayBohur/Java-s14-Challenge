package model;

import enums.BreadRollType;

public class Hamburger implements Addable {
    private String name;
    private String meat;
    private double price;
    private BreadRollType breadRollType;
    private Addition[] additions;

    public Hamburger(String name, String meat, double price, BreadRollType breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.additions = new Addition[4];
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    @java.lang.Override
    public void addAddition(String name, double price) {
        for(int i = 0; i< additions.length;i++){
           if(additions[i] == null){
               additions[i] = new Addition(name,price);
               break;
           }
        }
    }

    public void itemizeHamburger(){
        StringBuilder builder = new StringBuilder();
        builder.append("name: " + name + "\n");
        builder.append("meat: " + meat + "\n");
        builder.append("bread roll type: " + breadRollType + "\n");

        for(Addition addition : additions){
            if(addition != null) {
                builder.append("addition name: "+ addition.getName() + "\n");
                builder.append("addition price: "+ addition.getPrice() + "\n");
                price = price + addition.getPrice();
            }

        }
        System.out.println(builder);
        System.out.println("total price: " + price);
    }

    @java.lang.Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", breadRollType=" + breadRollType +
                ", additions=" + java.util.Arrays.toString(additions) +
                '}';
    }


}

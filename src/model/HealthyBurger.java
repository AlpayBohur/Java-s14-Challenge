package model;

import enums.BreadRollType;

public class HealthyBurger extends Hamburger{

    private Addition healthyAddition1;
    private Addition healthyAddition2;

    public HealthyBurger(String name, String meat, double price, BreadRollType breadRollType) {
        super(name, meat, price, breadRollType);
    }

    public Addition getHealthyAddition1() {
        return healthyAddition1;
    }

    public Addition getHealthyAddition2() {
        return healthyAddition2;
    }

    @java.lang.Override
    public void addAddition(String name, double price) {
        if (healthyAddition1 == null){
            healthyAddition1 = new Addition(name,price);

        } else if (healthyAddition2 == null){
            healthyAddition2 = new Addition(name,price);
        }
    }

    @java.lang.Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        if (healthyAddition1 != null){
            builder.append("healthyAddition: " + getHealthyAddition1().getName() + "\n");
            setPrice(getPrice() + getHealthyAddition1().getPrice());
        }
        if (healthyAddition2 != null){
            builder.append("healthyAddition: " + getHealthyAddition2().getName() + "\n");
            setPrice(getPrice() + getHealthyAddition2().getPrice());
        }
        super.itemizeHamburger();
    }
}

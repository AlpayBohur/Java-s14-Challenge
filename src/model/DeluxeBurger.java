package model;

import enums.BreadRollType;

public class DeluxeBurger extends Hamburger{
private Drink drink;
private Cips cips;


    public DeluxeBurger(Drink drink, Cips cips) {
        super("Deluxe burger", "double", 19.10, BreadRollType.DOUBLE_BURGER);
        this.drink = drink;
        this.cips = cips;
    }

    @java.lang.Override
    public void addAddition(String name, double price) {
        System.out.println("\n deluxe burger için malzeme eklenmez");
    }

    @java.lang.Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("drınk: " + drink.getDrinkType() + "\n");
        builder.append("drınk: " + drink.getDrinkType() + "\n");
        System.out.println(builder);
        super.itemizeHamburger();
    }
}

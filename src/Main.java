import enums.BreadRollType;
import enums.CipsType;
import enums.DrinkType;
import model.*;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("BASIC", "NORMAL", 3.36, BreadRollType.WRAP);
        hamburger.addAddition("tomato", 8.20);
        hamburger.addAddition("lettuce", 8.20);
        hamburger.addAddition("cheese", 8.20);
        hamburger.addAddition("pickle", 8.20);
        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("vegan","normal",1.25,BreadRollType.WRAP);
        healthyBurger.addAddition("egg", 5.63);
        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger(new Drink(DrinkType.COLA),new Cips(CipsType.CURLY));
        db.addAddition("ass",15);
        db.itemizeHamburger();

    }
}
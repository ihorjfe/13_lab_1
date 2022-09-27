public class Menu {
    String salad;//салати
    String dish;//страви
    String drink;//напої

    double priceSalads;
    double priseDish;
    double priseDrink;

    public Menu(String salads, String dish, String drink, double priceSalads, double priseDish, double priseDrink) {
        this.salad = salads;
        this.dish = dish;
        this.drink = drink;
        this.priceSalads = priceSalads;
        this.priseDish = priseDish;
        this.priseDrink = priseDrink;
    }
    void Zamovlenya(){
        System.out.println("Ціна повного замовлення: "+(priceSalads+priseDrink+priseDish));
    }
    double Akcia(){
        double a =  priceSalads+priseDish/2;
        return a;
    }
}



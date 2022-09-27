public class Main {
    public static void main(String[] args) {
        Hall h = new Hall(20, 20, 5, 22);
        h.numberTables();
        System.out.println("Площа залу: " + h.square());

        Kitchen k = new Kitchen("Олег Олексійович", 7, 5000, 2, 8);
        k.people();
        System.out.println("Кількість годин працівників за тиждень: " + k.times());

        Menu m = new Menu("Салат", "Страва", "Напої", 80, 100, 50);
        m.Zamovlenya();
        System.out.println("Якщо ви замовите "+m.salad+" і " +m.dish+ " то знижка 50% і ціна буде: "+ m.Akcia());
    }
}

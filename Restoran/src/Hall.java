public class Hall {
    // змінні екземплярів класу
    double width; //ширина залу
    double length; //довжина залу
    double height; //висота залу
    int tables;//кількість столів

    public Hall(double width, double length, double height, int tables) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.tables = tables;
    }
    void numberTables(){
        System.out.println("Кількість столиків: "+tables);
    }
    double square(){
        double s = width*length*height;
        return s;
    }
}

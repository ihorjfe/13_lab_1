public class Kitchen {
    // змінні екземплярів класу
    String chiefcook;//головний кухар
    int cooks; //кількість кухарів
    double  area;//площа кухні
    int cleaners;//кількість прибиральників на кухні
    double time;//час роботи працивників за день

    public Kitchen(String chiefcook, int cooks, double area, int cleaners, double time) {
        this.chiefcook = chiefcook;
        this.cooks = cooks;
        this.area = area;
        this.cleaners = cleaners;
        this.time = time;
    }

    void people(){
        System.out.println("Кількість працивників в кухні: "+(cooks+cleaners));
    }
    double times(){
        double t = time*6;
        return t;
    }
}

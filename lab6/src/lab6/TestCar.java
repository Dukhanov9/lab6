package lab6;

public class TestCar {
    public static void main(String[] args) {
        car c1 = new car("Audi", "Q7", "4L", 2180000, 2015);
        c1.println();
        car c2 = new car("Porsche", "Boxter", "718", 4000000, 2016);
        c2.println();
        car c3 = new car("BMW", "X5", "50i", 2000000, 2014);
        c3.println();
    }
}

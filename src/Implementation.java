public class Implementation {
    public static void main(String[] args) {
        Manager m1 = new Manager("vai",12, "12",54,10000,5,9);
        RegionalHead r1 = new RegionalHead("ram", 54, "12", 65, 20000,"indore", 8, 9 );
        System.out.println("m1.calculateIncrement(12.5f) = " + m1.calculateIncrement(12.5f));
        System.out.println("r1.calculateIncrement(10.5f) = " + r1.calculateIncrement(10.5f));
    }
}

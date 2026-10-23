public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("GLE", "Mercedes", 2020, 350_000, "white", 5);
        Car car2 = new Car("GLC", "Mercedes", 2023, 200_000, "silver", 3);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getColor());
        int year = car1.getYear();
        car1.setColor("black");
        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("The HashCode of this object is: " + car2.hashCode());
        System.out.println("The HashCode of this object is: " + car1.hashCode());
    }
}
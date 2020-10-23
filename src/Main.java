public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.model = "Audi";
        car1.year = 2019;
        car1.price= 300000;

        car2.model= "Mercedes";
        car2.year= 2020;
        car2.price= 400000;

        System.out.println(car1.model + " har årsmodell " + car1.year + " och kostar " + car1.price + "kr");
        System.out.println(car2.model + " har årsmodell " + car2.year + " och kostar " + car2.price + "kr");
    }
}


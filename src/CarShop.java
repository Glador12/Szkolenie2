public class CarShop {
    public static void main(String[] args) {

//        int doors = 5;
//        String carColor = "czarny";
//        String wheelsColor = "Srebrny";
//        String tiresColor = "czarny";
//        String brand1 = "audi";
//        String brand2 = "bmw";
//        String model3 = "a4";
//        String model4 = "e36";

        Car car1 = new Car();
        car1.brand = "audi";
        car1.model = "a4";
        car1.color = "czarny";
        car1.wheelsColor = "srebrny";
        car1.tiresColor = "czarny";
        car1.doors = 5;
        String car1Info = car1.brand + "," + car1.model + "," + car1.color + ","
                + car1.wheelsColor + "," + car1.tiresColor + "," + car1.doors;
        System.out.println(car1Info);

//        Car car2 = new Car();
//        car2.brand = "VW";
//        car2.model = "Passat";
//        car2.color = "czerwony";
//        car2.wheelsColor = "srebrny";
//        car2.tiresColor = "czarny";
//        car2.doors = 5;

//
//        System.out.println(car1.brand);
//        System.out.println(car1.doors);
//        System.out.println(car1.model);
//
//        System.out.println(car2.brand);
//        System.out.println(car2.model);
//        System.out.println(car2.doors);
//
//        car2.brand = "Ferrari";
//        car2.model = "Enzo";
//        System.out.println(car2.brand);
//        System.out.println(car2.model);
//        System.out.println(car2.doors);
//

    }
}

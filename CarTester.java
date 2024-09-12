
import java.util.Scanner;

public class CarTester {
    Scanner scanner = new Scanner(System.in);
    public Car addCar(){
        System.out.println("Enter car name:");
        String newCustomCar = scanner.nextLine();
        System.out.println("Enter miles driven:");
        int customCarMiles = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter gallons used to drive miles:");
        int customCarGallons = Integer.parseInt(scanner.nextLine());

        return new Car(newCustomCar, customCarMiles, customCarGallons);
    }

    public static void main(String[] args) {
        Car car1 = new CarTester().addCar();
        System.out.println(car1);
        System.out.println("--------------------NEXT CAR----------------------");
        Car car2 = new CarTester().addCar();
        System.out.println(car2);
    }
}

/*
Console Output:
Enter car name:
Honda Civic
Enter miles driven:
234
Enter gallons used to drive miles:
100
Honda Civic averaged 2.3 mpg
--------------------NEXT CAR----------------------
Enter car name:
Toad Mobile
Enter miles driven:
13
Enter gallons used to drive miles:
7
Toad Mobile averaged 1.9 mpg



*/



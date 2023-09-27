import java.util.Random;
public class VehicleRace {
    public static void main(String[] args) {
        // Create two Vehicle objects with initial speeds between 95 and 105
        Random random = new Random();
        int initialSpeed1 = random.nextInt(11) + 95;
        int initialSpeed2 = random.nextInt(11) + 95;

        Vehicle car1 = new Vehicle("Porsche", initialSpeed1);
        Vehicle car2 = new Vehicle("Ferrari", initialSpeed2);

        System.out.println("Initial Information:");
        System.out.println("Car 1 - Brand: " + car1.GetBrand() + ", Speed: " + car1.GetSpeed() + " mph, Distance Traveled: " + car1.GetDistanceTraveled() + " miles");
        System.out.println("Car 2 - Brand: " + car2.GetBrand() + ", Speed: " + car2.GetSpeed() + " mph, Distance Traveled: " + car2.GetDistanceTraveled() + " miles");

        int finishLine = 500;
        boolean raceFinished = false;

        while (!raceFinished) {
            car1.varySpeed();
            car2.varySpeed();

            car1.UpdateDistanceTraveled();
            car2.UpdateDistanceTraveled();


            try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("\nRace Progress:");
            System.out.println("Car 1 - Brand: " + car1.GetBrand() + ", Speed: " + car1.GetSpeed() + " mph, Distance Traveled: " + car1.GetDistanceTraveled() + " miles");
            System.out.println("Car 2 - Brand: " + car2.GetBrand() + ", Speed: " + car2.GetSpeed() + " mph, Distance Traveled: " + car2.GetDistanceTraveled() + " miles");

            if (car1.GetDistanceTraveled() >= finishLine || car2.GetDistanceTraveled() >= finishLine) {
                raceFinished = true;
            }
        }

        // Determine the winner
        if (car1.GetDistanceTraveled() > car2.GetDistanceTraveled()) {
            System.out.println("\nWinner: Porsche");
        } else if (car2.GetDistanceTraveled() > car1.GetDistanceTraveled()) {
            System.out.println("\nWinner: Ferrari");
        } else {
            System.out.println("\nIt's a tie!");
        }
    }
}
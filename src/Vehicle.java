import java.util.Random;
 class Vehicle {
    private String Brand;
    private int Speed;
    private int DistanceTraveled;

    public Vehicle(String Brand, int intitialSpeed){
        this.Brand = Brand;
        this.Speed = intitialSpeed;
        this.DistanceTraveled = 0;
    }
    public String GetBrand(){
        return Brand;
    }
     public int GetSpeed(){
        return Speed;
     }
     public int GetDistanceTraveled(){
        return DistanceTraveled;
     }
     public void UpdateDistanceTraveled(){
      DistanceTraveled += Speed;
     }
     public void varySpeed() {
         Random random = new Random();
         int SpeedChange = random.nextInt(21) - 10;
         Speed += SpeedChange;
     }
}

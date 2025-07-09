abstract class Vehicle
{
    String brand;
  public abstract void displayDetails();
  public void startEngine()
  {
    System.out.println(" Engine started for " + brand);
  }
}
class Car extends Vehicle
{
    Integer speed;
    Car( String brand, Integer speed)
    {
        this.brand=brand;
        this.speed=speed;
    }
    public void displayDetails()
    {
        System.out.println("Brand :" + brand );
        System.out.println("Speed :" + speed + "km/h" );
    }
    
}
  public class Demo
 {
    public static void main(String a[])
    {
        Car obj = new Car("Tata",80);
        obj.startEngine();
        obj.displayDetails();
    }
 }
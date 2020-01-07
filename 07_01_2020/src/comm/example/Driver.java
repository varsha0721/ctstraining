package comm.example;

public class Driver {
public static void main(String[] args)
{
 Transport t = new Truck();
 t.calculateDistance(100, 250);
 t.calculateEfficiency(50, 40);
 Transport w = new WaterBus();
 w.calculateDistance(200, 300);
 w.calculateEfficiency(60, 40);
 System.out.println(t+"\n"+w);
}

}

package week8;
import java.util.Scanner;


public class WEEK8 {

    static ClassRoom room1 = new ClassRoom("301",(short)30,true,false);
    static ClassRoom room2 = new ClassRoom("302",(short)40,false,false);
    
    public static void main(String[] args) {
           
        System.out.println("Room: " + room1.getRoomNumber());
        System.out.println("Capacity: " + room1.getCapacity());
        System.out.println("Availability: " + room1.isAvailability());
        System.out.println("Room: " + room1.isHasComputers());
        
        Scanner sc=new Scanner(System.in);
        System.out.print("room number: ");
        String rn=sc.nextLine();
        room1.changeRoomNum(rn);
        
        System.out.println("Room: " + room2.getRoomNumber());
        System.out.println("Capacity: " + room2.getCapacity());
        System.out.println("Availability: " + room2.isAvailability());
        System.out.println("Room: " + room2.isHasComputers());
    }
    
}

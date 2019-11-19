
package week8;


public class ClassRoom {
    
   private String roomNumber;
   private short capacity;
   private boolean hasComputers;
   private boolean availability;

    public ClassRoom(String roomNumber, short capacity, boolean hasComputers, boolean availability) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.hasComputers = hasComputers;
        this.availability = availability;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }

    public void setHasComputers(boolean hasComputers) {
        this.hasComputers = hasComputers;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
   
   
   public void changeRoomNum(String newRoomNum){
       roomNumber = newRoomNum;
   }

    public String getRoomNumber() {
        return roomNumber;
    }

    public short getCapacity() {
        return capacity;
    }

    public boolean isAvailability() {
        return availability;
    }
    
    public boolean isHasComputers(){
        return hasComputers;
    }
   
   
}

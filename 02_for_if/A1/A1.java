public class A1 {
    public static void main(String[] args) {
        Door door = new Door(12.3, 45.6, false);
        door.openDoor();
        door.closeDoor();
        System.out.println(door.calculateSurface());
    }
}

class Door {
    private double width;
    private double height;
    private boolean open;

    public Door(double width, double height, boolean open) {
        this.width = width;
        this.height = height;
        this.open = open;
    }

    public void openDoor() {
        this.open = true;
        System.out.println("Opening Door");
    }
    public void closeDoor() {
        this.open = false;
        System.out.println("Closing Door");
    }
    public void printOpen() {
        if (open) { System.out.println("The door is open"); }
        else { System.out.println("The door is close"); }
    }
    public double calculateSurface() {
        return  width * height;
    }
}
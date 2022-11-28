package airport;

public class Airplane {
    private String id;
    private int maxPassenger;
    private int currentPassenger;
    private boolean flying;
    private double speed;

    public Airplane(String id, int maxPassenger) {
        this.id = id;
        this.maxPassenger = maxPassenger;
        this.currentPassenger = 0;
        this.flying = false;
        this.speed = 0;
    }

    public void loadPassenger(int amount) {
        int totalPassenger = this.currentPassenger + amount;
        if (totalPassenger < this.maxPassenger) {
            this.currentPassenger = totalPassenger;
            System.out.println("Airplane " + this.id + " loads " + amount + " passengers.");
            System.out.println("Having " + this.currentPassenger + "passengers.");
        }
        else {
            System.out.println("Not enough seats.");
        }
    }

    public void unloadPassenger(int amount) {
        int totalPassenger = this.currentPassenger - amount;
        if (totalPassenger > 0) {
            this.currentPassenger = totalPassenger;
            System.out.println("Airplane " + this.id + " unloads " + amount + " passengers.");
            System.out.println("Having " + this.currentPassenger + "passengers.");
        } else {
            System.out.println("Not enough passengers.");
        }
    }

    public void takeOff() {
        if (!this.flying) {
            this.flying = true;
        }
        System.out.println("Airplane " + this.id + " is flying");
    }

    public void landing() {
        if (this.flying) {
            this.flying = false;
        }
        System.out.println("Airplane " + this.id + " is landing");
    }
}

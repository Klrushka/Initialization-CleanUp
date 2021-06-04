public class Tank {
    private int capacity = 0;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public int getCapacity() {
        return capacity;
    }

    public void finalize(){
         if (capacity == 0) System.out.println("Ready to destroy");
         else System.out.println("Not ready to destroy");
    }
}

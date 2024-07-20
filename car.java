public class car {
    String model = "harrier";
    String color = "black";
    int price = 1000000;

    void drive() {
        System.out.println("Zoom zoom zoom!");
    }

    void lock() {
        System.out.println("Car gets locked.");
    }

    void unlock() {
        System.out.println("Car gets unlocked.");
    }
}
class main{
    public static void main(String[] args) {
        car c1=new car();
        car c2=new car();
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.price);
        System.out.println(c2.model);
        // System.out.println(c2.color);
        System.out.println(c2.price);
        c2.color="grey";
        System.out.println(c2.color);
        c1.drive();
        // c1.lock();
        c1.unlock();

    }
   
}



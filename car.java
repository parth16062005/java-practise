public class car {
    String model;
    String color;
    int price;
    boolean islocked=false;
    // this code is for constructor
    car(){
        System.out.println("in the default constructor");
        model = "harrier";
        color = "black";
        price = 1000000;

    }
    car(String modelname, String colorname,int pricevalue ){
        System.out.println("in the paramatrize constructor");
        model=modelname;
        color=colorname;
        setprice(pricevalue);
    }


    void drive() {
        
        System.out.println("Zoom zoom zoom!");
    }

    void lock() {
        islocked=true;
        System.out.println("Car gets locked.");
    }

    void unlock() {
        islocked=false;
        System.out.println("Car gets unlocked.");
    }
    // setter for price
    void setprice(int pricevalue){
        price=pricevalue;
    }
    //gtter for price
    int getprice(){
        return price;
    }

}

class main{
    public static void main(String[] args) {
        //  this is for constructor code  
        car c1=new car("harrier","red",200000);
        car c2=new car();

        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.price);
        System.out.println(c2.model);
        System.out.println(c2.color);
        System.out.println(c2.price);


        // car c1=new car();
        // car c2=new car();
        // System.out.println(c1.model);
        // System.out.println(c1.color);
        // System.out.println(c1.getprice());
        // System.out.println(c2.model);
        // // System.out.println(c2.color);
        
        // c2.color="grey";
        // System.out.println(c2.color);
        // c1.drive();
        //  c1.lock();
         
        // c2.unlock();
        // System.out.println(c1.islocked);
        // System.out.println(c2.islocked);
        // c2.setprice(500000);
        // System.out.println(c2.getprice());

    }
   
}



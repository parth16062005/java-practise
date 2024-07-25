public class complexnumberoops {
    int real;
    int imaginary;
    // contructor
    complexnumberoops(int r,int i){
        real=r;
        imaginary=i;
    }
    void print(){
        System.out.println(real+"+"+imaginary+"i");
    }
    complexnumberoops add(complexnumberoops y){
        int sumreal=real+y.real;
        int sumimag=imaginary+y.imaginary;
        complexnumberoops res= new complexnumberoops(sumreal, sumimag);
        return res;

    }
    complexnumberoops sub(complexnumberoops y){
        int subreal=real-y.real;
        int subimag=imaginary-y.imaginary;
        complexnumberoops ros=new complexnumberoops(subreal, subimag);
        return ros;
    }

}

class mainparth {
    public static void main(String[] args) {
        complexnumberoops x=new complexnumberoops(2,3);
        x.print();
        complexnumberoops y=new complexnumberoops(-5,4);
        y.print();
        complexnumberoops z=x.add(y);
       z.print();
       complexnumberoops a=x.sub(y);
       a.print();
    }
}

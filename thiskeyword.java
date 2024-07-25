public class thiskeyword {
    int real;
    int imaginary;
    // contructor
    thiskeyword(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    void print(){
        
        System.out.println("this="+this);
        System.out.println(real+"+"+imaginary+"i");

    }
   thiskeyword add(thiskeyword y){
        int sumreal=real+y.real;
        int sumimag=imaginary+y.imaginary;
       thiskeyword res= new thiskeyword(sumreal, sumimag);
        return res;

    }
   thiskeyword sub(thiskeyword y){
        int subreal=real-y.real;
        int subimag=imaginary-y.imaginary;
       thiskeyword ros=new thiskeyword(subreal, subimag);
        return ros;
    }

}

class mainparth2 {
    public static void main(String[] args) {
        thiskeyword x=new thiskeyword(2,3);
        x.print();
        System.out.println("x ="+x);

    //    thiskeyword y=newthiskeyword(-5,4);
    //     y.print();
    //    thiskeyword z=x.add(y);
    //    z.print();
    //   thiskeyword a=x.sub(y);
    //    a.print();
    }
}



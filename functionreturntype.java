public class functionreturntype {
    public static int square (int num){
        return num * num;
    }
    static void first(){
        System.out.println("hello world");
    }
    static int[] heroes() {
        int[] num = new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        return num;
           
        }
    public static void main(String[] args) {
        System.out.println(square(10));
        System.out.println(square(7));
        first();
        int[] arr = heroes();
        for(int hero:arr){
            System.out.println(hero);
        }



    }
}

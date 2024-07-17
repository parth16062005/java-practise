public class functionmethodoverloading {
    static int add(int a ,int b){
        System.out.println("inside first add");
        return a+b;
    }
    static String add(String a,String b){
        System.out.println("inside second add");
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(5,5));
        System.out.println(add("hello"," java"));
    }
}

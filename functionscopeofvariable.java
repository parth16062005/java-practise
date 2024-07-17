public class functionscopeofvariable {
    static void hello(){
        String s="hello java";
        System.out.println(s);
    }
    public static void main(String[] args) {
        int a=5;
        if(true){
            a=10;
            System.out.println("inside the if , a = "+a);

        }
        System.out.println("outside the if , a = "+a);
        hello();
        //System.out.println(s);   this will give the error brcause s is the part f the function block that is declared above.//

     }
}

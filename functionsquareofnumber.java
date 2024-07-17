import java.util.Scanner;
public class functionsquareofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        Square(num);

    }
    public static void Square(int num){
        System.out.println(num*num);
    }
}

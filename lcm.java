import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int lcm=A;
        if(A<B){
            lcm=B;
        }
        for(;;){
            if(lcm%A==0 && lcm%B==0){
                break;
            }
            lcm++;

        }
        System.out.print(lcm);
        }
}

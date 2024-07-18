import java.util.Scanner;
import java.math.BigInteger;
public class computefactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        // int ans =1;
        // for(int i=1;i<=x;i++){            //normal code and can not compute big values
        //     ans =ans*i;
        // }
        // System.out.println(ans);
        int x=sc.nextInt();
        BigInteger ans=new BigInteger("1");
        for(int i=1;i<=x;i++){
            BigInteger temp=new BigInteger(i+"");
            ans=ans.multiply(temp);
        }
        System.out.println(ans);

    }
}

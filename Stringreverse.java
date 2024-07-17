import java.util.Scanner;
public class Stringreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.nextLine();
        // String rev="";
        // for(int i=s1.length()-1;i>=0;i--){
        //     rev+=s1.charAt(i);

        // } 
        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
        String rev=sb.toString();

        System.out.println(rev); 
      }
}

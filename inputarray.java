import java.util.Scanner;
public class inputarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]arr=new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       for(int i=0;i<arr.length;i++){
        System.out.println("the array at index " + i +" gives te value "+ arr[i]);
       }
    }
}

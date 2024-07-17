public class twodarraycreation {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][]a = new int[rows][cols];
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[0][3]=40;
        a[1][0]=50;
        a[1][1]=60;
        a[1][2]=70;
        a[1][3]=80;
        System.out.println(a[1][2]);
        System.out.println(a[0][3]);
        System.out.println(a[0][1]);
        System.out.println(a[2][3]);
    }
}

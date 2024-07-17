public class twodarrayitration {
    public static void main(String[] args) {
        int [][] a ={
            {2,3,4,8},
            {5,6,8,2},
            {5,6,7,1}
        };
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

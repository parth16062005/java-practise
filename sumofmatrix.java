import java.util.Scanner;

public class sumofmatrix {

    

   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int a[][]=new int[rows][cols];
        int b [][]=new int[rows][cols];   
        matrixread(a);
        matrixread(b);
        int c [][]=new int[rows][cols];
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }   
        for(int i=0;i<c.length;i++){
            for(int j =0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
    }
    }

public static void matrixread(int[][]mat){
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[i].length;j++){
            
            mat[i][j]=sc.nextInt();
            
        }
       
    }
 
}
}

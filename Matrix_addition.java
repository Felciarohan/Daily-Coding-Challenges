import java.util.Scanner;
public class Matrix_addition {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=s.nextInt();
            }
        }
         int b[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=s.nextInt();
            }
        }
        int d[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                d[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
    }
}

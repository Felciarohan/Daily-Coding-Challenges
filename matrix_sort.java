import java.util.Scanner;
public class matrix_sort {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int a[][]=new int[r][c];
        int k=0;
        int sort[]=new int[r*c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=s.nextInt();
                sort[k++]=a[i][j];
            }
        }
        for(int i=0;i<r*c;i++){
            for(int j=i+1;j<c*r;j++){
                if(sort[i]>sort[j]){
                    int t=sort[i];
                    sort[i]=sort[j];
                    sort[j]=t;
                }
            }
        }
        k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sort[k++];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}

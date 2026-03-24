import java.util.Scanner;
public class max_element_row {
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
        for(int i=0;i<r;i++){
            int find=max(a[i],c);
            System.out.println(find);
        }
    }
    private static int max(int[] a, int c) {
        int max=a[0];
        for(int i=1;i<c;i++){
           if(max<a[i])
           max=a[i];
        }
        return max;
}
}

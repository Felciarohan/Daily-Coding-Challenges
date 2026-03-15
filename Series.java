import java.util.Scanner;
public class Series {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int first=0,second=1;
        for(int i=0;i<n;i++){
            System.out.print(first+" ");
            int third=first+second;
            first=second;
            second=third;
        }
    }
}

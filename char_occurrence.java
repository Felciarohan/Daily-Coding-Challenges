import java.util.Scanner;
public class char_occurrence {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char ch[]=str.toCharArray();
        int n=str.length();
        char c=s.next().charAt(0);
        int count=0;
        for(int i=0;i<n;i++){
            if(ch[i]==c)
            count++;
        }
        System.out.print(count);
    }
}

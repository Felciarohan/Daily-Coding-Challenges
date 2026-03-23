import java.util.Scanner;
public class Last_word_length{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' ')
            count++;
            else break;
        }
        System.out.print(count);
    }
}
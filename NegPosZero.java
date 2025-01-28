import java.util.Scanner;
public class NegPosZero {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if (a>0){
            System.out.println("the integer is positive.");
        }else if (a<0){
            System.out.println("the integer is Negative.");
        }else{
            System.out.println("the integer is Zero.");
        }
        scanner.close();
    }
    
}

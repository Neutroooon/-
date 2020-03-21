import java.util.Scanner;

public class AICompute{
    public static void Factorial(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please write down a integer:");
        int sum = 1;
        if(scan.hasNextInt()){
            int x = scan.nextInt();
              for(int i=1;i<=x;i++){
                       sum = sum*i;
                           }
        }
        else{
            System.out.println("Please write down a integer!");
            Factorial();
        }
        System.out.println(sum);
    }
}
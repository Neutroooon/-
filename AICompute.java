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
    public static void Permutation(){
        System.out.println("       _   n  \n" +
                           "      / |     \n" +
                           "     /--| m    ");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please write n:");
        if(scan1.hasNextInt()){
            int x1 = scan1.nextInt();
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Please write m:");
            if(scan2.hasNextInt()){
                int x2 = scan2.nextInt();
                int result = 1;
                int result2 = 1;
                if(x1==x2){
                    for(int a=1;a<=x1;a++){
                        result2 = result2*a;
                    }
                    System.out.println(result2);
                }
                else{
                    if(x1<x2){
                        for(int b=(x2-x1+1);b<=x2;b++){
                            result = result*b;
                        }
                        System.out.println(result);
                    }
                    else{
                        System.out.println("Error!");
                        Permutation();
                    }
                }
            }
            else{
                System.out.println("Please give a integer!");
                Permutation();
            }
        }
        else{
            System.out.println("Please give a integer!");
            Permutation();
        }
    }
}
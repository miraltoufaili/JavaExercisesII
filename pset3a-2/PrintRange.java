import java.util.Scanner;

class PrintRange
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = myScanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = myScanner.nextInt();
        
        if (num1<num2){
            printIncreasing(num1,num2);
        } else if (num1>num2){
            printDeacreaing(num1,num2);
        } else if( num1==num2){
        System.out.print("[" + num1 + "]");
        }
    }
    public static void printIncreasing(int num1, int num2)
        {
            System.out.print("[");
            for (int i=num1; i<num2;i++) {
            System.out.print(i +  ",  " );}
            System.out.print(num2 + "]");
            System.out.println();
        }

        public static void printDeacreaing(int num1 , int num2)
        {
            System.out.print("[");
            for (int i=num1; i > num2;i--) {
            System.out.print(i +  ",  " );}
            System.out.print(num2 + "]");
            System.out.println();
        }
}      

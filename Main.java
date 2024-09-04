import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  =  new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int number = scanner.nextInt();

        int sum = 0;

        while(number!=0){
            int digit = number %10;
            sum += digit;
            number /= 10;
            
        }
        System.out.println("The Sum is "+ sum);

    }

}

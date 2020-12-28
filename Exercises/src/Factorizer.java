import java.util.Scanner;

public class Factorizer {

    public static void main(String[] args) {

        int number;
        String stringNumber;

        int sum = 0;
        int count = 0;


        Scanner userNumber = new Scanner(System.in);
        System.out.println("What number would you like to factor?");
        stringNumber = userNumber.nextLine();
        number = Integer.parseInt(stringNumber);

        System.out.println("The factors are: ");

        for(int i = 1; i <= number; i++){

            if(number % i == 0){
                sum+= i;
                count++;
                System.out.print( i + " ");
            }

        }
        System.out.println();
        System.out.println(number + " has " + count + " factors.");

        if(sum - number == number){
            System.out.println(number + " is a perfect number");
        }else{
            System.out.println(number + " is not a perfect number");
        }

        if(sum == number + 1){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }





    }
}

import java.text.DecimalFormat;
import java.util.Scanner;


public class InterestCalculator {

    public static DecimalFormat df2 = new DecimalFormat("#.00");

    public static void main(String[] args) {

        double initialInvestment;
        String stringInitialInvestment;

        int yearsInvesting;
        String stringYearsInvesting;

        double annualInterestRate;
        String stringAnnualInterestRate;

        int yearCount = 0;
        double interestEarned = 0;
        double endingAmount;
        int compoundRate;
        String stringCompoundRate;


        Scanner userInvestment = new Scanner(System.in);
        System.out.println("How much do you want to invest?");
        stringInitialInvestment = userInvestment. nextLine();
        initialInvestment = Double.parseDouble(stringInitialInvestment);

        Scanner userYears = new Scanner(System.in);
        System.out.println("How many years are investing?");
        stringYearsInvesting = userYears.nextLine();
        yearsInvesting = Integer.parseInt(stringYearsInvesting);

        Scanner userRate = new Scanner(System.in);
        System.out.println("What is the annual interest rate % growth");
        stringAnnualInterestRate = userRate.nextLine();
        annualInterestRate = Double.parseDouble(stringAnnualInterestRate);

        annualInterestRate = annualInterestRate / 100;

        Scanner userComRate = new Scanner(System.in);
        System.out.println("What is the rate of compound interest? \ndaily = 365 monthly = 12 quarterly = 4 ");
        stringCompoundRate = userComRate.nextLine();
        compoundRate = Integer.parseInt(stringCompoundRate);

        System.out.println("Calculating ...");

        do{
            yearsInvesting--;
            yearCount++;

            initialInvestment = initialInvestment + interestEarned;

            endingAmount = initialInvestment * Math.pow(1 + (annualInterestRate /compoundRate),compoundRate);

            interestEarned = endingAmount - initialInvestment;

            System.out.println("Year " + yearCount + ":");
            System.out.println("Began with $" + df2.format(initialInvestment));
            System.out.println("Earned $" + df2.format(interestEarned));
            System.out.println("Ended with $" + df2.format(endingAmount));
            System.out.println();

        }while(yearsInvesting > 0);




    }


}

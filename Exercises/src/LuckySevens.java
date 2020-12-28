import java.util.Scanner;

public class LuckySevens {

    public static void main(String[] args) {

        int dollars;
        String stringDollars;

        Scanner userBet = new Scanner(System.in);
        System.out.println("How many dollars do you have?");
        stringDollars = userBet.nextLine();
        dollars = Integer.parseInt(stringDollars);

         int rollDice = 0;
         int gameMoney = dollars;

         int maxAmount = 0;
         int rollMax = 0;

         while(gameMoney > 0 ){
             rollDice++;

             int diceOne = (int) (Math.floor(Math.random() * 6) + 1);
             int diceTwo = (int) (Math.floor(Math.random() * 6) + 1);
             int diceTotal = diceOne + diceTwo;

             if(diceTotal == 7){
                 gameMoney+=4;

             } else{
                 gameMoney--;
             }

             if(gameMoney > maxAmount){
                 maxAmount = gameMoney;
                 rollMax = rollDice;
             }
         }

        System.out.println("You are broke after " + rollDice + " rolls.");
        System.out.println("You should have quit after " + rollMax + " rolls when you had $" + maxAmount + ".");


    }
}

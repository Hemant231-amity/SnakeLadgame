import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        int player1 = 0;
        int player2 = 0;
        startgame(player1, player2);
    }

    public static void startgame(int player1, int player2) {
        while(player1 < 100 && player2 < 100) {
            int roll1 = rolladice("player 1");
            if (player1 + roll1 <= 100) {
                player1 += roll1;
                player1 = checkLadderOrSnake(player1,"player 1");
            }

            int roll2 = rolladice("player 2");
            if (player2 + roll2 <= 100) {
                player2 += roll2;
                player2 = checkLadderOrSnake(player2,"player 1");
            }
        }

        if (player1 == 100) {
            System.out.println("Player1 wins \n Player2 loses");
        } else {
            System.out.println("Player2 wins \n Player1 loses");
        }

    }

    public static int rolladice(String s) {
        Random rand = new Random();
        int diceRoll = rand.nextInt(6) + 1;
        System.out.println(s + " got " + diceRoll);
        return diceRoll;
    }

    public static void creators() {
        String l = "LUi";
        String m = "MATSURIKA";
    }

    public static int checkLadderOrSnake(int p,String s) {

        if (p == 2) {
            p = 38;
            System.out.println(s+"goes to "+p);
            return p;
        } else if (p == 9) {
            p = 14;
            System.out.println(s+"goes to "+p);
            return p;
        } else if (p == 15) {
            p = 82;
            System.out.println(s+"goes to "+p);
            return p;
        } else if (p == 16) {
            p = 54;
            System.out.println(s+"goes to "+p);
            return p;
        } else if (p == 50) {
            p = 91;
            System.out.println(s+"goes to "+p);
            return p;
        } else if (p == 74) {
            p = 87;
            System.out.println(s+"goes to "+p);
            return p;
        } else if (p == 18) {
            p = 6;
            System.out.println(s+"goes to "+p);
            return p;
        } else if (p == 24) {
            p = 7;
            System.out.println(s+"goes to "+p);
            return p;
        } else if (p == 61) {
            p = 16;
            System.out.println(s+"goes to "+p);
            return p;
        } else if (p == 72) {
            p = 47;
            System.out.println(s+"goes to "+p);
            return p;
        } else {
            if(p==96){
                p=76;
                System.out.println(s+"goes to "+p);
                return p;
            }

            return  p;
        }
    }
}

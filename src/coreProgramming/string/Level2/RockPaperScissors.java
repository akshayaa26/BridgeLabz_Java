package coreProgramming.string.Level2;
import java.util.*;

public class RockPaperScissors {

    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    static String winner(String user, String comp) {

        if (user.equals(comp)) return "Draw";

        if (user.equals("rock") && comp.equals("scissors") ||
                user.equals("paper") && comp.equals("rock") ||
                user.equals("scissors") && comp.equals("paper"))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0;

        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("-----------------------------------");

        for (int i = 1; i <= n; i++) {

            System.out.print("Game " + i + " choice: ");
            String user = sc.next().toLowerCase();

            String comp = computerChoice();
            String win = winner(user, comp);

            if (win.equals("User")) userWins++;
            else if (win.equals("Computer")) compWins++;

            System.out.println(i + "\t" + user + "\t" + comp + "\t\t" + win);
        }

        double userPercent = (userWins * 100.0) / n;
        double compPercent = (compWins * 100.0) / n;

        System.out.println("\nPlayer\tWins\tPercentage");
        System.out.println("----------------------------");
        System.out.println("User\t" + userWins + "\t" + userPercent + "%");
        System.out.println("Computer\t" + compWins + "\t" + compPercent + "%");

        sc.close();
    }
}

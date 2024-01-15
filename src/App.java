public class App {
    public static void main(String[] args) {
        int victories = 30;
        int defeats = 20;

        int balance = calculateRankBalance(victories, defeats);
        String rankLevel = determineRankLevel(balance);

        System.out.printf("The hero has a balance of %d and is at the rank level of %s.%n", balance, rankLevel);
    }

    public static int calculateRankBalance(int victories, int defeats) {
        return victories - defeats;
    }

    public static String determineRankLevel(int victories) {
        String rankLevel;

        if (victories <= 10) {
            rankLevel = "Iron";
        } else if (victories >= 10 && victories <= 20) {
            rankLevel = "Bronze";
        } else if (victories >= 21 && victories <= 50) {
            rankLevel = "Silver";
        } else if (victories >= 51 && victories <= 80) {
            rankLevel = "Gold";
        } else if (victories >= 81 && victories <= 90) {
            rankLevel = "Diamond";
        } else if (victories >= 91 && victories <= 100) {
            rankLevel = "Legendary";
        } else {
            rankLevel = "Immortal";
        }

        return rankLevel;
    }
}

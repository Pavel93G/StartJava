public class MyFirstGame {
    public static void main(String[] args) {
        int srcNum = 99;
        int playerNum = 78;

        while ( srcNum != playerNum) {
            if (srcNum > playerNum) {
                System.out.println("Ваше число: " + playerNum + ", меньше загаданного числа =)");
                playerNum++;
            } else if (srcNum < playerNum){
                System.out.println("Ваше число: " + playerNum + ", больше загаданного числа =)");
            }
        }
        System.out.println("Урра!!! Вы победили =)");
    }
}
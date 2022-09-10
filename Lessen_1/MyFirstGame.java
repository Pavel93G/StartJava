public class MyFirstGame {
    public static void main(String[] args) {
        int compNum = 10;
        int playerNum = 25;

        while ( srcNum != playerNum) {
            if (srcNum > playerNum) {
                System.out.println("Ваше число: " + playerNum + ", меньше загаданного числа =)");
                playerNum++;
            } else if (srcNum < playerNum){
                System.out.println("Ваше число: " + playerNum + ", больше загаданного числа =)");
                playerNum--;
            }
        }
        System.out.println("Ваше число: " + playerNum + " Урра!!! Вы победили =)");
    }
}
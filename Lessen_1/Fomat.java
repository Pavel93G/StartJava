public class Fomat {
    public static void main(String[]args){
       System.out.println("Dec Char");
        for(int i = 0; i <= 255; i++) {
            System.out.format("%3d",i);
            System.out.format(" %c", (char) i);
            System.out.format("\n");
        }
    }
}
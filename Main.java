import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] samogloski = {"a", "e", "i","o", "u", "ó", "y", "ą", "i" ,"ę"};
        while (true){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter letter");

            String letter = myObj.nextLine();
            int flag = 0;

            for(String l: samogloski ){
                if (letter.equals(l)){
                    flag = 1;
                    System.out.println("samogłoska");
                }
            }
            if (flag == 0){
                System.out.println("spółgłoska");
            }

        }
    }
}
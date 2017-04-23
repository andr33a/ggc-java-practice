import java.util.Scanner;

public class Oddities {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        if (cases >= 1 && cases <= 20){
            while (cases >= 1){
                int i = sc.nextInt();
                if (i % 2 == 0)
                {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
                cases--;
            }
        }

        sc.close();
    }
}

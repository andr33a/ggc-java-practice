import java.util.Scanner;

public class Modulo {
    public static void main(String [] args){
        boolean [] mod = new boolean[42];
        Scanner sc = new Scanner(System.in);
        int sum = 0;


        for (int i = 0; i < 10; i++){
            int number = sc.nextInt();
            int index = number % 42;
            if (mod[index] == false){
                sum = sum + 1;
                mod[index] = true;
            }
        }

        sc.close();

        System.out.println(sum);
    }
}

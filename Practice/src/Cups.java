import java.util.Scanner;

public class Cups {

    static int[] radius;
    static String[] colors;
    static int cups;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        cups = sc.nextInt();
        sc.nextLine();

        radius = new int[cups];
        colors = new String[cups];

        for (int i = 0; i < cups; i++){
            String line = sc.nextLine();
            String[] content = line.split(" ");

            if (content.length == 2) {
                String newColor;
                int newRadius;
                if (isIntValue(content[0])) {
                    newRadius = Integer.parseInt(content[0])/2;
                    newColor = content[1];
                } else {
                    newRadius = Integer.parseInt(content[1]);
                    newColor = content[0];
                }

                radius[i] = newRadius;
                colors[i] = newColor;
            }
        }

        sc.close();

        while (getMinIndex() != -1){
            int minIndex = getMinIndex();
            System.out.println(colors[minIndex]);
            radius[minIndex] = 1000;
        }
    }

    static int getMinIndex(){
        int minRadius = 1000;
        int minIndex = -1;
        for(int i = 0; i< cups; i++){
            if (radius[i] < minRadius){
                minRadius = radius[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static boolean isIntValue(String number){
        try{
            Integer.parseInt(number);
        } catch (NumberFormatException ex){
            return false;
        }

        return true;
    }
}

import java.util.Scanner;

public class Apaxians {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();
        StringBuffer newName = new StringBuffer();

        int currentIndex = 0;
        boolean sameLetter = false;
        char currentLetter = name.charAt(currentIndex);

        while (currentIndex < name.length()){
            int nextIndex = currentIndex + 1;
            if (nextIndex == name.length()){
               break;
            }

            char nextLetter = name.charAt(nextIndex);

            if (!sameLetter) {
                newName.append(currentLetter);
            }

            sameLetter = (currentLetter == nextLetter);
            currentIndex = currentIndex + 1;
            currentLetter = name.charAt(currentIndex);
        }

        if (!sameLetter) {
            newName.append(currentLetter);
        }


        System.out.println(newName.toString());
    }
}

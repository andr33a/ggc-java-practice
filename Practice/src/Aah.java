import java.util.Scanner;

public class Aah {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String patient = sc.next();
        String doctor = sc.next();
        sc.close();

        int patientALength = patient.length() - 1;
        int doctorALength = doctor.length() - 1;

        if (patientALength >= doctorALength){
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}

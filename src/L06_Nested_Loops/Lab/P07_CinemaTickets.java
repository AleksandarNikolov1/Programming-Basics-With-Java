package L06_Nested_Loops.Lab;

import java.util.Scanner;

public class P07_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;

        int counterTotal = 0;

        String movieName = scanner.nextLine();
        while (!(movieName.equals("Finish"))) {
            int freeSpaces = Integer.parseInt(scanner.nextLine());

            counterTotal = 0;


            for (int i = 0; i < freeSpaces; i++) {
                String type = scanner.nextLine();
                if (type.equals("End")) {
                    break;
                }

                counterTotal++;
                switch (type) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    default:
                        kidCount++;
                        break;
                }
            }


            double hall = (double) counterTotal / freeSpaces * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, hall);

            movieName = scanner.nextLine();
        }

        counterTotal = studentCount + standardCount + kidCount;
        System.out.printf("Total tickets: %d%n", counterTotal);

        double studentPercent = (100.0 / counterTotal ) * studentCount;
        System.out.printf("%.2f%% student tickets.%n", studentPercent);

        double standardPercent = (100.0 / counterTotal) * standardCount;
        System.out.printf("%.2f%% standard tickets.%n", standardPercent);

        double kidPercent = (100.0 / counterTotal) * kidCount;
        System.out.printf("%.2f%% kids tickets.", kidPercent);

    }
}
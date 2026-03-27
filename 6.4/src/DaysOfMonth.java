import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month;
        int year;

        while (true) {
            System.out.print("Enter month: ");
            String monthInput = sc.nextLine().trim();
            month = parseMonth(monthInput);

            if (month == -1) {
                System.out.println("Invalid month. Please enter again.");
                continue;
            }

            System.out.print("Enter year: ");
            String yearInput = sc.nextLine().trim();

            if (!isValidYear(yearInput)) {
                System.out.println("Invalid year. Please enter again.");
                continue;
            }

            year = Integer.parseInt(yearInput);
            break;
        }

        int days = getDaysInMonth(month, year);
        System.out.println("Number of days: " + days);
    }

    public static int parseMonth(String input) {
        String s = input.toLowerCase();

        if (s.equals("1") || s.equals("jan") || s.equals("jan.") || s.equals("january")) return 1;
        if (s.equals("2") || s.equals("feb") || s.equals("feb.") || s.equals("february")) return 2;
        if (s.equals("3") || s.equals("mar") || s.equals("mar.") || s.equals("march")) return 3;
        if (s.equals("4") || s.equals("apr") || s.equals("apr.") || s.equals("april")) return 4;
        if (s.equals("5") || s.equals("may")) return 5;
        if (s.equals("6") || s.equals("jun") || s.equals("jun.") || s.equals("june")) return 6;
        if (s.equals("7") || s.equals("jul") || s.equals("jul.") || s.equals("july")) return 7;
        if (s.equals("8") || s.equals("aug") || s.equals("aug.") || s.equals("august")) return 8;
        if (s.equals("9") || s.equals("sep") || s.equals("sep.") || s.equals("sept") || s.equals("sept.") || s.equals("september")) return 9;
        if (s.equals("10") || s.equals("oct") || s.equals("oct.") || s.equals("october")) return 10;
        if (s.equals("11") || s.equals("nov") || s.equals("nov.") || s.equals("november")) return 11;
        if (s.equals("12") || s.equals("dec") || s.equals("dec.") || s.equals("december")) return 12;

        return -1;
    }

    public static boolean isValidYear(String input) {
        if (input.isEmpty()) return false;

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) return 29;
                return 28;
            default:
                return -1;
        }
    }
}
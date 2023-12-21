import java.util.Scanner;

public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the day of the week: ");
        String userInput = scanner.nextLine().toUpperCase();

        DayOfWeek userDay;
        try {
            userDay = DayOfWeek.valueOf(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("The entered day of the week is not valid.");
            return;
        }

        boolean isWeekend = userDay.isWeekend();
        System.out.println("This day is " + (isWeekend ? "a weekend." : "not a weekend."));
    }
}
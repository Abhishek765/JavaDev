public class NewArrowSwitchCase {

    public static void main(String[] args) {
        String day = "Friday";

        switch (day) {
            case "Saturday", "Sunday" -> System.out.println("Holiday chill or learn something new!!! 🧐");
            case "Friday" -> System.out.println("Wrap up the day of the week 🕺");
            default -> System.out.println("Working Day 👨‍💻");
        }
    }
}

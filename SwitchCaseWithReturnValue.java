public class SwitchCaseWithReturnValue {

    public static void main(String[] args) {
        String day = "Friday";
        String result = "";

        // ! Here We're returning value from switch case and storing in result variable
        result = switch (day) {
            case "Saturday", "Sunday" -> "Holiday chill or learn something new!!! 🧐";
            case "Friday" -> "Wrap up the day of the week 🕺";
            default -> "Working Day 👨‍💻";
        };

        // ! Here another form of switch statement -> yield
        result = switch (day) {
            case "Saturday", "Sunday":
                yield "Holiday chill or learn something new!!! 🧐";
            case "Friday":
                yield "Wrap up the day of the week 🕺";
            default:
                yield "Working Day 👨‍💻";
        };

        System.out.println(result);
    }
}

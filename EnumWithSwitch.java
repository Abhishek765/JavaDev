enum Status {
    PENDING,
    FAILURE,
    RUNNING,
    SUCCESS,
}

public class EnumWithSwitch {
    public static void main(String[] args) {

        Status status = Status.RUNNING;

        switch (status) {
            case RUNNING:
                System.out.println("Status is RUNNING");
                break;

            case PENDING:
                System.out.println("Status is PENDING");
                break;

            case FAILURE:
                System.out.println("Status is FAILURE");
                break;

            default:
                System.out.println("Status is SUCCESS");
                break;
        }
    }

}

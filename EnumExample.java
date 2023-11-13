/*
 * An enum is a special "class" that represents a group of constants 
 */

enum ApiStatus {
    PENDING,
    SUCCESS,
    FAILURE
}

public class EnumExample {
    public static void main(String[] args) {
        ApiStatus apiPendingStatus = ApiStatus.PENDING;
        ApiStatus[] allApiStatus = ApiStatus.values();

        for (ApiStatus apiStatus : allApiStatus) {
            System.out.println(apiStatus + " : " + apiStatus.ordinal());
        }

        System.out.println(apiPendingStatus.ordinal());
    }

}

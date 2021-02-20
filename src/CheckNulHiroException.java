public class CheckNulHiroException extends RuntimeException {
    CheckNulHiroException(String message) {
        super("\n" + message);
        Move.sleep(1000);
    }
}

public class MaxAttemptsExceededException extends Exception {
    public MaxAttemptsExceededException(String errorMessage) {
        super(errorMessage);
    }
}

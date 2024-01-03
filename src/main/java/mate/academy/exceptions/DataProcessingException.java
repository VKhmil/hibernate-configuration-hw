package mate.academy.exceptions;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message) {
        super(message);
    }

    public DataProcessingException(String message, Throwable throwable) {
        super(message, throwable);
    }
}

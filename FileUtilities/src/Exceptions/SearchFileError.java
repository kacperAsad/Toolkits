package Exceptions;

public class SearchFileError extends RuntimeException {

    public SearchFileError() {
        super();
    }

    public SearchFileError(String message) {
        super(message);
    }
}

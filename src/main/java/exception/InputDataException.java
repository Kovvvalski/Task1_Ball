package main.java.exception;

public class InputDataException extends Exception {
  public InputDataException() {

  }

  public InputDataException(String message) {
    super(message);
  }

  public InputDataException(Throwable cause) {
    super(cause);
  }

  public InputDataException(String message, Throwable cause) {
    super(message, cause);
  }
}

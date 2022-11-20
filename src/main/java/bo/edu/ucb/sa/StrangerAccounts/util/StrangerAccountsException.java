package bo.edu.ucb.sa.StrangerAccounts.util;

public class StrangerAccountsException extends RuntimeException{
    public StrangerAccountsException(String message) {
        super(message);
    }

    public StrangerAccountsException(String message, Throwable cause) {
        super(message, cause);
    }
}

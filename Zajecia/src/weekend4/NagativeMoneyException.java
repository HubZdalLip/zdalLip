package weekend4;

public class NagativeMoneyException extends RuntimeException {
    //RuntimeException - mozliwe zlapanie ale nie ejst ono koneiczne  ( tak jak bledow InputMismatch, Illegal...)
    //Exception - konieczne zlapanie tak jak ParseException, SQLException, IOException
    //Throwable - możliwe rzucenie wyjatku....

    public NagativeMoneyException(String message) {
        super(message);
    }
}

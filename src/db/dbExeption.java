package db;

public class dbExeption  extends RuntimeException{

    private static final long serialVersionUID = 1L;
    public dbExeption(String msg){
        super(msg);
    }

}
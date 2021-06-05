public class WrongCompassParametersException extends RuntimeException{
    public WrongCompassParametersException() {
        super("Character is not N,W,S or E!");
    }

}

public class StackEmptyException extends Exception{
    String errorMsg;

    public StackEmptyException(String error){
        errorMsg = error;
    }

    public String toString(){
        return("Customzed Exception object : "+errorMsg);
    }
}

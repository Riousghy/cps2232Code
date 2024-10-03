public class MyQueueException extends Exception{
    String errMsg;

    public MyQueueException(String error){
        errMsg=error;
    }

    public String toString(){
        return(errMsg);
    }
}

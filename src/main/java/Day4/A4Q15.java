package Day4;
import java.io.Reader;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class A4Q15 {
    public static void main(String[] args){
        BlockingQueue<String> q = new ArrayBlockingQueue<>(1024);
        ReaderThread reader = new ReaderThread(q,args[0]);
        WriterThread writer = new WriterThread(q,args[1]);
        new Thread(reader).start();
        new Thread(writer).start();
    }
}

package Day4;

import javax.imageio.IIOException;
import java.io.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ReaderThread implements Runnable{
    protected BlockingQueue<String> bq;
    private String inputFileName;
    public ReaderThread(BlockingQueue bq, String inputFileName){
        this.bq = bq;
        this.inputFileName = inputFileName;
    }

    public String getInputFileName() {
        return inputFileName;
    }

    public void setInputFileName(String inputFileName) {
        this.inputFileName = inputFileName;
    }

    @Override
    public void run(){
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(new File(inputFileName)));
            String buffer = null;
            while((buffer=br.readLine())!= null){
                System.out.println(buffer);
                bq.put(buffer);
            }
            bq.put("EOF");
        }catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }finally {
            try{
                br.close();
            }catch(IOException ioe2){
                ioe2.printStackTrace();
            }
        }
    }
}

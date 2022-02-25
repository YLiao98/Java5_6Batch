package Day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;

public class WriterThread implements Runnable{
    protected BlockingQueue<String> bq;
    private String outputFileName;
    public WriterThread(BlockingQueue<String> bq,String outputFileName) {
        this.bq = bq;
        this.outputFileName = outputFileName;
    }
    private String Helper(String str){
        String line = new String(str);
        int res = 0;
        boolean plus = false;
        boolean minus = false;
        char[] chars = line.toCharArray();
        for(int i = 0; i < chars.length; i++){

            if(chars[i]==' '){
                continue;
            }else if(chars[i] == '+'){
                plus = true;
            }else if(chars[i] == '-'){
                minus = true;
            }else{
                if(plus){
                    res += Integer.parseInt(""+chars[i]);
                    plus = false;
                }else if(minus){
                    res -= Integer.parseInt(""+chars[i]);
                    minus = false;
                }else{
                    res += Integer.parseInt(""+chars[i]);
                }
            }
        }
        line += " = ";
        line += String.valueOf(res);
        return line;
    }
    @Override
    public void run() {
        PrintWriter pr = null;
        try{
            pr = new PrintWriter(new File(outputFileName));
            while(true){

                String buffer = bq.take();
                if(buffer.equals("EOF")){
                    break;
                }
                String newBuffer;
                if(buffer.equals(" ") || buffer.equals("")) continue;
                newBuffer = this.Helper(buffer);
                System.out.println(buffer);

                pr.write(newBuffer+"\n");

            }
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }finally{
            pr.close();
        }
    }
}

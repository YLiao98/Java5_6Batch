package Day2;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Random;
import java.util.Scanner;

public class A1q13 {
    /*
    The method returns one of the four random actions
     */
    public static void doSomething(int x){
        Random random = new Random();
        int nxt = random.nextInt(4);
        if(nxt == 1){
            System.out.println(A1q13.doSum(x));
        }else if(nxt == 0){
            A1q13.createFile(x);
        }else if(nxt == 2){
            System.out.println(A1q13.printTimestamp());
        }else{
            A1q13.printHello(x);
        }
    }

    /*
      This method creates a txt file with name given by parameter
     */
    public static void createFile(int inputNum){
        try{
            String filename = inputNum+".txt";
            File newFile = new File(filename);
            if(newFile.createNewFile()){
                System.out.println("File "+newFile.getName()+" created");
            }else{
                System.out.println("File already exists.");

            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    /*
    This method sums up 1 to x
     */
    public static int doSum(int x){
        if(x == 0){
            return 0;
        }
        return x + A1q13.doSum(x-1);
    }
    /*
    This method prints current timestamp
     */
    public static String printTimestamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.toString();
    }

    /*
    This method print message 'Hello' x times
     */
    public static void printHello(int x){
        for(int i = 0;i < x;i++){
            System.out.println("hello");
        }
    }
    /*
    Check if string is an integer.
     */
    public static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static void main(String[] args){
        //fetch user input
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        while(line.charAt(0)  != 'q' && A1q13.isNumeric(line)) {
            int x = Integer.parseInt(line);
            if (x > 0) {
                // loop x time calling doSomething method
                for(int i = 0;i < x;i++) {
                    A1q13.doSomething(x);
                }
            } else {
                System.out.println("Invalid input (numeric value is less than 0).");
            }
            line = scanner.nextLine();
        }
        scanner.close();
        System.out.println("Exit program...");
        System.exit(1);
    }
}

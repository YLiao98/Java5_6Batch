package Day2.A2Q16;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.*;

public class CountFiles {

    public static void count(Criteria criteria){
        int countFiles = 0;
        int countDirs = 0;
        StringBuilder sb = new StringBuilder("");
        HashSet<String> extension = new HashSet<>();
        File testDir = new File(criteria.getPath());
        File[] files = testDir.listFiles();
        if(files != null && files.length > 0){
            for(File f : files){
                if(f.isFile()){
                    countFiles++;
                }else if(f.isDirectory()){
                    countDirs++;
                }
                String fName = f.getName();
                int lastPeriod = fName.lastIndexOf(".");
                if(lastPeriod != -1){
                    extension.add(fName.substring(lastPeriod+1));
                }
            }
        }

        for(String str : extension){
            sb.append(str+" ");
        }

        if(criteria.isCountSubFolder()) {
            System.out.println("There are " + countFiles + " files and " + countDirs + " folders inside folder" + criteria.getPath() + " with extension " + sb.toString());
        }else{
            System.out.println("There are " + countFiles + " files inside folder" + criteria.getPath() + " with extension " + sb.toString());

        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String path = null;
        String extension = null;
        // ask for path
        System.out.println("Input you desired path:");
        String line = scanner.nextLine();
        File dir = new File(line);
        while(!dir.exists() || dir.isFile()){
            System.out.println("Given path is invalid, please input a new path:");
            line = scanner.nextLine();
            dir = new File(line);
        }
        path = line;
        //include sub folder or not
        System.out.println("Do you want to count the subfolders as well? [y/n]");
        Pattern pattern = Pattern.compile("[y|n|no|yes]",Pattern.CASE_INSENSITIVE);
        line = scanner.nextLine();
        while(!pattern.matcher(line).find()){
            System.out.println("Invalid command, please answer y/n:");
            line = scanner.nextLine();
        }
        boolean flag = false;
        if(line.equals("y") || line.equals("yes")){
            flag = true;
        }else{
            flag = false;
        }


        Criteria criteria = new Criteria(path, flag);

        CountFiles.count(criteria);
    }
}

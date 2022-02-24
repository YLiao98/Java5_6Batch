## Assignment 2

- Question 1: Why we need packages in Java?

#### Answer

Package is a namespace that organizes classes and interfaces. We need packages in a project to keep things structured.

- Question 2: What is the default imported package?

#### Answer

Default package is java.lang, it is imported internally done by JVM.

- Qeustion 3: What is Class? What is Object?

#### Answer

Class is a "blueprint" for creating an object. Object is an instance of a class.

- Question 4: Why do we need constructor?

#### Answer

Because we need to initialize the object of the class.

- Question 5: What is the default value of local variable? What is the default value of instance variable?

#### Answer
local variables do not contain default values. Instance variables have default value: for numbers, it's 0, for boolean, it's false, for object references, it's null.

- Question 6: What is garbage collection?

#### Answer

Garbage collection is a process handled by JVM, it automatically removes the unused objects from memory every once in a while.

- Question 7: The protected data can be access by subclasses or same package? T or F

#### Answer

True

- Question 8: What is immutable class?

#### Answer

An immutable class means we cannot change its content. We can not inherit the class, and all the field members are final and private.

- Question 9: What's the difference between "==" and equals method?

#### Answer

"==" compares the address of objects they refer to while equals method compares the content of the objects.

- Question 10: What is wrapper class?

#### Answer

A wrapper classes are used when we want to use primitive datatypes as objects.

- Question 11: What is autoboxing?

#### Answer

It is a conversion done by Java compiler that can wrap a primitive type value to corresponding wrapper class. Ex: Integer a = 12;

- Question 12: StringBuilder is thread-safe but slower than StringBuffer, true or false?

#### Answer

False, it is the other way around.

- Question 13: Constructor can be inherited, true or false?

#### Answer

False, it cannot be inherited.

- Question 14: How to call a super class's constructor?

#### Answer

Inside the child class's constructor, in the first line inside the child constructor, use super keyword: super();

- Question 15: Which class is the super class of all classes?

#### Answer

Object class from java.lang

- Question 16: Create a program to count how many files/folders are there inside one folder.

#### See package A2Q16 inside Day2 package
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

    
    
    class Criteria {
        private String path;
        private boolean countSubFolder;
    
        public Criteria(String path, boolean countSubFolder) {
            this.path = path;
            this.countSubFolder = countSubFolder;
        }
    
        public String getPath() {
            return path;
        }
    
        public void setPath(String path) {
            this.path = path;
        }
    
        public boolean isCountSubFolder() {
            return countSubFolder;
        }
    
        public void setCountSubFolder(boolean countSubFolder) {
            this.countSubFolder = countSubFolder;
        }
    
    }
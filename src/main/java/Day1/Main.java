package Day1;

public class Main {
    int num;


    public static void main(String[] args){
        Main main = new Main();

        Integer s1 = 12;
        Integer s4 = 12;
        Integer s2 = new Integer(12);
        Integer s3 = Integer.valueOf(12);
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println(s3 == s1);
        System.out.println(main.num);
    }
}

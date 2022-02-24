package Day2;

public class A1q15 {

    public static int findSecondLargest(int[]arr){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > first) {
                second = first;
                first = j;
            } else if (j > second && j != first) {
                second = j;
            }
        }

        return second;
    }

    public static void main(String[] args){
        //test example
        int[] arr1= {1,5,2,5};
        if(arr1.length < 2){
            System.out.println("Invalid array");
            System.exit(1);
        }
        int res = A1q15.findSecondLargest(arr1);
        System.out.println(res);

    }
}

package Day2;


public class A1q14 {
    public static int[] mergeArr(int[]arr1, int[]arr2){


        int[] merged = new int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,merged,0,arr1.length);
        System.arraycopy(arr2,0,merged,arr1.length,arr2.length);
        return merged;
    }

    public static void main(String[] args){
        //test example
        int[] arr1= {1,1,1,1};
        int[] arr2= {2,2,2,2};
        int[] res = A1q14.mergeArr(arr1,arr2);
        for(int i = 0;i< res.length;i++) {
            System.out.println(res[i]);
        }

    }
}

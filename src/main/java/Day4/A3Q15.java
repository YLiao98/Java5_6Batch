package Day4;
import java.util.*;
public class A3Q15 {

    public static void main(String[] args){
        HashMap<String, Boolean> count = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        Integer[] arr1 = {1,2,3,4,10};
        List<Integer> lst = new ArrayList<Integer>(Arrays.asList(arr1));
        Map<String, String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","4");
        for(Map.Entry<String,String> entry: map.entrySet()){
            String val = entry.getValue();
            if(!count.containsKey(val)){
                count.put(val,true);
            }
        }
        for(Integer i : lst){
            String parsedInt = i.toString();
            if(!count.containsKey(parsedInt)){
                res.add(i);
            }
        }
        //print result
        res.stream().forEach(System.out::println);
    }

}

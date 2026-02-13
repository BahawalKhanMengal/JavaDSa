package HashmapCodes;

import java.util.HashMap;
import java.util.Set;

public class GetCommonElement {
   public static void main(String[] args){
       int[] arr1 = {1,1,2,2,2,3,5};
       int[] arr2 = {1,1,1,2,2,4,5};
       HashMap<Integer,Integer> common = new HashMap<>();
      for (int val : arr1){
          if (common.containsKey(val)){
              int of = common.get(val);
              int nf = of + 1;
              common.put(val,nf);
          }else {
              common.put(val,1);
          }
      }
      for (int val : arr2){
          if (common.containsKey(val)){
              System.out.print(val + " -> ");
              common.remove(val);
          }
      }
   }
}

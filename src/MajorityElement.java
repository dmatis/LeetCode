import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class MajorityElement {

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static int getMajorityElement(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int freq = Integer.MIN_VALUE;
        // adds elements to a frequency map
        for (int i = 0; i < nums.length; i++) {
            if (hmap.get(nums[i]) == null) {
                hmap.put(nums[i], 1);
            }
            else {
                hmap.put(nums[i],(hmap.get(nums[i])+1));
            }
        }

        Iterator it = hmap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            // requires cast due to Autoboxing
            Integer value = (Integer)pair.getValue();
            if (value > freq) {
                freq = value;
            }
            // prevents ConcurrentModificationException
            //it.remove();
        }
        return getKeyByValue(hmap, freq);
    }

    public static void main(String[] args) {
        int[] smallArray = {0,2,1,3,1,1};
        int[] largeArray = {0,1,4,3,0,2,0,5,4,9,0,6,0};

        System.out.println(getMajorityElement(smallArray));
        System.out.println(getMajorityElement(largeArray));
    }
}

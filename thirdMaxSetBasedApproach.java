import java.util.*;

class thirdMaxSetBasedApproach {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> numsSet = new TreeSet<Integer>();
        for(int num : nums){
            numsSet.add(num);
        }

        if(numsSet.size()<3) return numsSet.last();
        else return numsSet.lower(numsSet.lower(numsSet.last()));
    }
}

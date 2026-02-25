import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class four_sum {
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i<n; i++){
            for(int j=i+1;j<n;j++){
                Set<Integer> seenvar = new HashSet<>();
                for(int k = j+1;k<n;k++){
                    long l = target - (nums[i] + nums[j] + nums[k]);

                    if(seenvar.contains((int)l)){
                        List<Integer> temp = Arrays.asList(nums[i] , nums[j] , nums[k], (int)l);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                     seenvar.add(nums[k]);
                }
            }
        }

        return new ArrayList<>(set);
    }
}


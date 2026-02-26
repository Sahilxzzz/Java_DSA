import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class four_sum {
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
<<<<<<< HEAD
      int n = nums.length;
      Set<List<Integer>> set = new HashSet<>();

      for(int i=0;i<n;i++){
        for(int j = i+1;j<n;j++){
            for(int k = j+1;k<n;k++){
                for(int l=k+1;l<n;l++){
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum == target){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
      }
      return new ArrayList <>(set);
=======
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
>>>>>>> 9410dd59daea60e93eab047613e5a5bd94a2d349
    }
}


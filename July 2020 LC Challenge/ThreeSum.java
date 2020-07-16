class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Set<List<Integer>> hashSet = new HashSet<>(); 
        List<List<Integer>> result = new ArrayList<>(); 
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            int j = i + 1; 
            int k = nums.length-1; 
            while(j < k){
                if(nums[i] + nums[j] + nums[k] < 0){
                    j++; 
                }
                else if(nums[i] + nums[j] + nums[k] > 0){
                    k--; 
                }
                else{
                    List<Integer> set = new LinkedList<>(); 
                    set.add(nums[i]);
                    set.add(nums[j]);
                    set.add(nums[k]); 
                    hashSet.add(set); 
                    j++; 
                    k--; 
                }
            }
        }
        
        for(List<Integer> set : hashSet){
            result.add(set);
        }
        
        return result;
        }
          
}

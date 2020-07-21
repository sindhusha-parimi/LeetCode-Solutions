class Solution {
    public List<List<Integer>> subsets(int[] nums) {
          List<List<Integer>> v = new ArrayList<>();  
        v.add(new ArrayList<>());  
        for(int i=0; i<nums.length; i++){
            int size=v.size(); 
            for(int j=0;j<size;j++){
                List<Integer> val = new ArrayList<>(v.get(j)); 
                val.add(nums[i]);  
                v.add(val); 
            }
        }
        return v;
    }
}

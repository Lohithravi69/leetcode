
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet <Integer> first=new HashSet<>();
        int len=nums.length;
        int res=0;
        for(int i=0;i<len;i++){
            if(first.contains(nums[i])){
                res=nums[i];
            }
            else{
                first.add(nums[i]);
            }
        }return res;
    }
}
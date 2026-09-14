class Solution {
    public int[] productExceptSelf(int[] nums) {
        int products_left[]=new int[nums.length];
        int p =1;
        for(int i =0;i<nums.length;i++){
            products_left[i]=p*nums[i];
            p=products_left[i];
        }
        int products_right[]=new int[nums.length];
        int p1 = 1;
        for(int i = nums.length-1;i>=0;i--){
            products_right[i]=p1*nums[i];
            p1=products_right[i];
        }
        int output[] = new int [nums.length];
        for(int i = 0;i<nums.length;i++){
            if(i==0) output[0]=products_right[1];
            if(i==nums.length-1) output[nums.length-1]=products_left[nums.length-2];
            if(i!=0&&i!=nums.length-1)
                output[i]=products_left[i-1]*products_right[i+1];
        }
        return output;
    }
}  

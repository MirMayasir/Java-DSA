package com;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int x = 0;
        int result = 0;
        for(int i= 0; i<nums.length-1; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
    int arr[] = {2,7,11,5};
    int target = 16;
    int num[] = twoSum(arr,target);
    for(int i=0; i<num.length; i++)
        {
            System.out.println(num[i]);
        }
    }
}
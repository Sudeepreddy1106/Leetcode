class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
    int j=0;
    int k=0;
    while(j<nums1.length && k<nums2.length){
    if(nums1[j]==nums2[k]){
        return nums1[j];
    }
    else if(nums1[j]<nums2[k]){
        j++;
    }
    else{
        k++;
    }
    } 
    return -1;  
    }
    
}

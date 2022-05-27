import java.util.Arrays;

public class MergeSort {
   private static void merge(int[] nums, int i, int j, int k) {
      int mergeSize = k - i + 1;               
      int[] mergeNumbers = new int[mergeSize]; 
                                             
      int mergePos = 0;                        
      int leftPos = i;                        
      int rightPos = j + 1;                  
      
      while (leftPos <= j && rightPos <= k) {
         if (nums[leftPos] <= nums[rightPos]) {
            mergeNumbers[mergePos] = nums[leftPos];
            leftPos++;
         }
         else {
            mergeNumbers[mergePos] = nums[rightPos];
            rightPos++;
         }
         mergePos++;
      }

      while (leftPos <= j) {
         mergeNumbers[mergePos] = nums[leftPos];
         leftPos++;
         mergePos++;
      }
   
      while (rightPos <= k) {
         mergeNumbers[mergePos] = nums[rightPos];
         rightPos++;
         mergePos++;
      }
   
      for (mergePos = 0; mergePos < mergeSize; mergePos++) {
         nums[i + mergePos] = mergeNumbers[mergePos];
      }
   }
   
   private static void mergeSort(int[] nums, int i, int k) {
      int j = 0;
      
      if (i < k) {
         j = (i + k) / 2;

         mergeSort(nums, i, j);
         mergeSort(nums, j + 1, k);
            
         merge(nums, i, j, k);
      }
   }
}

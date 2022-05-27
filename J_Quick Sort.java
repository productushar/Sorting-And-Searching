public class Quicksort {
   private static int partition(int[] nums, int start, int end) {
      int midpoint = start + (end - start) / 2;
      int pivot = nums[midpoint];
      int low = start;
      int high = end;
      boolean done = false;
     
      while (!done) {
         while (nums[low] < pivot) {
            low = low + 1;
         }
      
         while (pivot < nums[high]) {
            high = high - 1;
         }
      
         if (low >= high) {
            done = true;
         }
        
         else {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
         }
      }

      return high;
   }
   
   private static void quicksort(int[] nums, int start, int end) {
      if (end <= start) {
         return;
      }
          
      int high = partition(nums, start, end);
      quicksort(nums, start, high);
      quicksort(nums, high + 1, end);
   }
}

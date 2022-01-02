//This java program uses selection sort to rearrange an array of integers in ascending order

public static void sort (int[] numbers){  
  
   int min, temp;
   for (int index = 0; index < numbers.length-1; index++){
      min = index;
      for (int scan = index+1; scan < numbers.length; scan++){
         if (numbers[scan] < numbers[min]) min = scan;
      }

      temp = numbers[min];
      numbers[min] = numbers[index];
      numbers[index] = temp;
   }
}  

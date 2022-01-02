////This java program uses insertion sort to rearrange an array of integers in ascending order

public static void sort (int[] numbers) 
{      
   for (int index = 1; index < numbers.length; index++){     
       int key = numbers[index];
       int position = index;

       while (position > 0 && numbers[position-1] > key){		  
         numbers[position] = numbers[position-1];
         position--;
       }
       numbers[position] = key;
   }
}  

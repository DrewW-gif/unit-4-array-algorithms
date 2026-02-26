public class ArrayAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private int[] intArray;
   private int[] intArray2;
   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */
   public ArrayAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
      intArray = new int[arraySize];
      intArray2 = new int[arraySize];

   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for (int i = 0; i < intArray.length; i++) {
         int arrayVal = (int)Math.random() * 100;
         intArray[i] = arrayVal;
      }

   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      int num = startNum;
      for (int i = 0; i < intArray.length; i++) {
         intArray[i]=num;
         num++;
      }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int biggestNum = 0;
      for (int i = 0; i < intArray.length; i++) {
         biggestNum = 0;
         if (intArray[i] > biggestNum) {
            biggestNum = intArray[i];
         }
      }
   return biggestNum;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      boolean dupes = false;
      for (int i = 0; i < intArray.length; i++) {
         for (int x = 0; x < intArray.length; x++) {
            if (intArray[i] == intArray[x]) {
               dupes = true;
            }
         }
      }
   return dupes;
   }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      boolean inArray = false;
      for (int num : intArray) {
         if (intToFind == num) {
            inArray = true;
         }
      }
   return inArray;
   }

   // ===== UWHS ALGORITHMS =====

   public int longestContiguousSubarray() {
      // UWHS ONLY:
      // Return the length of the longest strictly increasing contiguous segment
      int biggestNumInArow = 0;
      int numInArow = 0;
      for (int i = 0; i < intArray.length; i++) {
      numInArow = 0;
         if (intArray[i] > intArray[i]--) {
            numInArow++;
         }
         else if (intArray[i] < intArray[i]--) {
         biggestNumInArow = numInArow;
         }
      }
   return biggestNumInArow;
   }

   public int[] moveZeroesToEnd() {
      // UWHS ONLY:
      // Move all zeros to the end of while preserving order of non-zero elements. 
      // HINT: use a new array instead of changing intArray
      // Return the changed array
   int twoPos = 0;
      for (int i = 0; i < intArray.length; i++) {
         if (intArray[i] == 0) {
            intArray2[twoPos] = 0;
            twoPos++;
         }
      }
      for (int x = 0; x < intArray.length; x++) {
         if (intArray[x] != 0) {
            intArray[twoPos] = intArray[x];
            twoPos++;
         }
      }
   return intArray2;
   }
   public void printArray() {
      for (int i = 0; i < intArray.length; i++) {
         System.out.print(intArray[i] + " ");
      }
   }
   public void printArray2() {
      for (int i = 0; i < intArray2.length; i++) {
         System.out.print(intArray2[i] + " ");
      }
   }

   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      // 2) Populate the array with random numbers
      // 3) Call and print the result of EACH REQUIRED method
      // 4) If you are UWHS, also test the UWHS methods
      ArrayAlgorithms iA = new ArrayAlgorithms(10);
      iA.populateArrayWithRandom();
      iA.populateArrayWithSequential(33);
      iA.printArray();
      System.out.println(iA.findMax());
      System.out.println(iA.hasDuplicates());
      System.out.println(iA.isInArray(40));
      System.out.println(iA.longestContiguousSubarray());
      iA.moveZeroesToEnd();
      iA.printArray2();
      System.out.println(" ");
      iA.printArray(); 
   }
}

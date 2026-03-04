public class ArrayListAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private int[] intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */
   public int length = 0;

   public ArrayListAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
      ArrayList<String> myArrayList = new ArrayList<String>();

   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      length =(int)Math.random() * 100;
      for (int i = 0; i < length; i++) {
         int arrayVal = (int)(Math.random() * 100);
         intArray.add(arrayVal);
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      for (int i = 0; i < length; i++) {
         intArray.add(startNum);
         startNum++;
      }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int biggestNum = 0;
      for (int i = 0; i < length; i++) {
         if (intArray.get(i) > biggestNum) {
            biggestNum = intArray.get(i);
         }
      }
      
   return biggestNum;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
   }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
   }

   // ===== UWHS ALGORITHMS =====

   public int longestContiguousSubarray() {
      // UWHS ONLY:
      // Return the length of the longest strictly increasing contiguous segment
   }

   public int[] moveZeroesToEnd() {
      // UWHS ONLY:
      // Move all zeros to the end of while preserving order of non-zero elements. 
      // HINT: use a new array instead of changing intArray
      // Return the changed array
   }

   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      // 2) Populate the array with random numbers
      // 3) Call and print the result of EACH REQUIRED method
      // 4) If you are UWHS, also test the UWHS methods
   }
}

 // create an array of 7 integers.

 public class ArrayDemo {
    public static void main(String[] args) {
        int[] anArray;	        // declare an array of integers

        anArray = new int[7];	// create an array of integers

        /// put the 7 number into array
        anArray [0] = -23;
        anArray [1] = 3;
        anArray [2] = 2;
        anArray [3] = 890;
        anArray [4] = 43;
        anArray [5] = -50;
        anArray [6] = 100;

        

    // assign a value to each array element and print 
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = i;
            System.out.print(anArray[i] + " ");
        }
        System.out.println("anArray 4th index = " + anArray[3]);
    
      // Create 5 string
       anArray = new int[5];
       anArray [0] = 10;
       anArray [1] = 20;
       anArray [2] = 30;
       anArray [3] = 40;
       anArray [4] = 50;
     
    }

}
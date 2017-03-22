import com.tidkumlaa.learning.intro.ArrayTutorial;
import java.util.Arrays;
import java.util.Random;

public class Main {


    static int[] sampleArray = null;
    
    public static void main(String[] args) {
	    // write your code here
	    ArrayTutorial cArray = new ArrayTutorial();
	    
	    
	    if(sampleArray == null)
	    {
	        sampleArray = getArray(10);
	    }
	    
	    
	    testFindMinArrayR(cArray, sampleArray);
    }
    
    static private int[] getArray(int num)
    {
        int[] arr = new int[num];
        
        Random rand = new Random();
        
        for(int i=0; i < num; i++){
            

            arr[i] = rand.nextInt(num) + 1;
            
        }
        
        return arr;
    }
    
    static  private void testFindMinArraySimple(ArrayTutorial cArray, int[] data)
    {
        
        System.out.println("Array : "+Arrays.toString(data));
        
        int min = cArray.findMinSimple(data);
	    
	    System.out.println("Min is "+min);
    }
    
    static  private void testFindMinArrayRecursive(ArrayTutorial cArray, int[] data)
    {
        
        System.out.println("Array : "+Arrays.toString(data));
        
        int min = cArray.findMinRecursive(data, data.length - 1);
	    
	    System.out.println("Min is "+min);
    }
    
    static  private void testFindMinArrayR(ArrayTutorial cArray, int[] data)
    {
        
        System.out.println("Array : "+Arrays.toString(data));
        
        int min = cArray.findMin(data, 0, data.length - 1);
	    
	    System.out.println("Min is "+min);
    }
}

package pattern;

public class BubbleSort {

	
	//B U B L E S O R T I N G
    public static void bubbleSort(int[] array) {
    	
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
               
            }
           
            
        }
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,4,2};
        bubbleSort(array);
        System.out.println("A F T E R S O T I N G");
        for (int value : array) System.out.print( value + " ");
        System.out.println();
        
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
               
            }     
            
        }
        
        
        for (int value : array) System.out.print( value + " ");
    }
}


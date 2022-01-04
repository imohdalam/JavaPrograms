class SwapAlternate{
    void swap(int[] array){
        int temp;
        for(int i=0; i<array.length-1; i+=2){
            temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
    }
    void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}

public class Main
{
    public static void main(String[] args) {
        int[] array = {4,9,6,8,6,7,2,5,0,15};
        SwapAlternate s = new SwapAlternate();
        s.swap(array);
        s.printArray(array);
    }
}

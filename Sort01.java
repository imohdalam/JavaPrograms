public class Main{

     public static void main(String []args){
        System.out.print("\nUnSorted 0 1 : ");
        int[] a = {1,0,1,0,1,1,1,0,0,1,0,1};
        for(int k=0; k<a.length; k++){
            System.out.print(" "+a[k]);
        }
        int temp = 0;
        int i = 0;
        int j = a.length - 1;
        while(i<j){
            if(a[i]==1&&a[j]==1)
                j--;
            else if(a[i]==1&&a[j]==0){
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++; j--;
            }
            else if(a[i]==0&&a[j]==1){
                i++; j--;
            }
            else if(a[i]==0 && a[j]==0)
                 i++;
            
        }
        System.out.print("\n  Sorted 0 1 : ");
        for(int k=0; k<a.length; k++){
            System.out.print(" "+a[k]);
        }
     }
}

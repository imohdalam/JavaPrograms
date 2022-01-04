class FindSingleOccurence{
    int Single(int[] array){
        int temp = 0;
        for(int i=0; i<array.length; i++){
            temp = temp^array[i];
        }
        return temp;
    }
}

public class Main
{
    public static void main(String[] args) {
        int[] array = {2,3,1,6,3,6,2};
        FindSingleOccurence s = new FindSingleOccurence();
        System.out.println(s.Single(array));
    }
}

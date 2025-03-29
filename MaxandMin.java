/* Finding the Maximum and Minimum elements in the array  */

public class MaxandMin {
    public static void main(String[] args) {
        int[] arr = { 15, 10, 5, 8, 2, 30, 26, 7 };

        int min = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            } else {
                if(arr[i] > max)
                max = arr[i];
            }
        }
        System.out.println("Maximum Number : "+max);
        System.out.println("Minimum Number : "+min);
            
    }
}

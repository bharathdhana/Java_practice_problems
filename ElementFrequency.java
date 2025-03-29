/* Find the number of occurence in elements of the array */

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {10,20,10,20,30,30,30,40,40,40,40,50,50,50,50,50,10};
        boolean[] visited = new boolean[arr.length];

        for(int i = 0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }

            int count = 1;
            for(int j =i+1 ; j<arr.length;j++) {
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(" Element " + arr[i] + " Occurences: " + count);
        }  
    }
}

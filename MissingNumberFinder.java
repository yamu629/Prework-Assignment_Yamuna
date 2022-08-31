import java.util.Scanner;
class MissingNumberFinder {
 public static void main(String[] args) {
     //Input
     Scanner in = new Scanner(System.in);
     int size = in .nextInt();//size of array
     int[] arr = new int[size-1];
     for(int i=0;i<size-1;i++)
        arr[i] = in.nextInt();//array
     System.out.println(missingNumberFinder(arr, size));
 }
 static int missingNumberFinder(int array[], int n) {
    for(int i=0;i<n-1;i++){
        if(i+1!=(array[i])){
            return(i+1);
        }

    }
    return(n);
 }
}
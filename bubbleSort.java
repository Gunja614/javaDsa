import java.util.Scanner;

public class bubbleSort {
    public void sorti(int [] arr, int n){
        for(int i = 0; i<n-1;i++){
            for(int j = 0; j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    void pintArray(int [] arr, int n){
        for(int i = 0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        bubbleSort bs = new bubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        bs.sorti(arr, n);
        bs.pintArray(arr, n);
        
    }
}

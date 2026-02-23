import java.util.Scanner;

public class selectionSort {
        public void sorti(int [] arr, int n){
        for (int i =0 ; i<n-1;i++){
            int smallest = i;
            for(int j = i+1; j<n-1;j++){
                if(arr[j]<arr[smallest]){
                smallest = j;
                }
            }
            if(smallest!=i){
                int temp;
                temp = arr[i];
                arr[i]= arr[smallest];
                arr[smallest]= temp;
            }
        }

    }
    void printArray(int [] arr, int n){
        System.out.println("The array: ");
        for(int i = 0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        selectionSort ss = new selectionSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter value: ");
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        ss.sorti(arr, n);
        ss.printArray(arr, n);
    }
}

public class ArrayAsList {
    // Data Members
    private int size;
    private int arr[];
    private int idx;

    // Using Default Constructor
    public ArrayAsList() {
        this.size = 5;
        this.arr = new int[size];
        this.idx = -1;
    }

    // Using Parameterized Constructor
    public ArrayAsList(int capacity) {
        this.size = capacity;
        this.arr = new int[size];
        this.idx = -1;
    }

    // Adding Method
    public void addAtLast(int data) {
        if (this.size - 1 == this.idx) {
            System.out.println("Array is Full");
            return;
        } else {
            this.idx++;
            this.arr[this.idx] = data;
        }
    }

    public void addAtBegin(int data) {
        if (size - 1 == this.idx) {
            System.out.println("Array is Full");
            return;
        } else {
            this.idx++;
            for (int i = this.idx; i > 0; i--) {
                this.arr[i] = this.arr[i - 1];
            }
            this.arr[0] = data;
        }
        System.out.println("Added Successfully");
    }

    public void addAtPosition(int data, int pos) {
        if (this.size - 1 == this.idx) {
            System.out.println("Array is Full");
            return;
        } else {
            this.idx++;
            for (int i = this.idx; i > pos - 1; i--) {
                this.arr[i] = this.arr[i - 1];
            }
            this.arr[pos - 1] = data;
        }
        System.out.println("Added Successfully");
    }

    // Deleting Method
    public void deleteFromEnd() {
        if (this.idx == -1) {
            System.out.println("Array is Empty");
        } else {
            this.idx--;
            System.out.println("Deleted Successfully");
        }
    }

    public void deleteFromBegin() {
        if (this.idx == -1) {
            System.out.println("Array is Empty");
        } else {
            int data = this.arr[0];
            for (int i = 0; i < this.idx - 1; i++) {
                this.arr[i] = this.arr[i + 1];
            }
            this.idx--;
            System.out.println("Deleted Successfully and Deleted Element is " + data);
        }
    }

    public void deleteFromPosition(int pos) {
        if (this.idx == -1) {
            System.out.println("Array is Empty");
        } else {
            int data = this.arr[pos - 1];
            for (int i = pos - 1; i <= this.idx - 1; i++) {
                this.arr[i] = this.arr[i + 1];
            }
            this.idx--;
            System.out.println("Deleted Successfully and Deleted Element is " + data);
        }

    }

    // Searching
    public void search(int key) {
        if (this.idx == -1) {
            System.out.println("Array is Empty");
        } else {
            for (int i = 0; i <= this.idx; i++) {
                if (this.arr[i] == key) {
                    System.out.println("Element Found at Index " + i);
                    return;
                }
            }
            System.out.println("Element Not Found");
        }
    }

    // Methods display
    public void display() {
        if (this.idx == -1) {
            System.out.println("Array is Empty");
            return;
        }
        for (int i = 0; i <= this.idx; i++) {
            System.out.print(this.arr[i] + " | ");
        }
    }

    // Method to show the size of array
    public void size() {
        System.out.println("Size of Array " + this.size);
    }

    public static void main(String[] args) {
        ArrayAsList list = new ArrayAsList();
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(100);
        list.display();
        // list.addAtBegin(67);
        // list.display();
        // list.addAtPosition(100,2);
        // list.display();
        // list.deleteFromEnd();
        // list.display();
        // list.deleteFromBegin();
        // list.display();
        // list.deleteFromPosition(2);
        // list.display();
        list.search(100);

        /*
         * ArrayAsList list=new ArrayAsList(10);
         * list.addAtLast(10);
         * list.addAtLast(20);
         * list.addAtLast(30);
         * list.display();
         * list.size();
         */
    }

}
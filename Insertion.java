public class Insertion{
    private int arr[];
    private int size;
    private int idx;
    Insertion(){
        this.size=5;
        this.idx=-1;
        this.arr=new int[this.size];
    }
    
    public void addAtLast(int data){
        if(this.size-1==this.idx){
            System.out.println("Overflow");
        }
        else{
            idx++;
            arr[idx]=data;
        }
    }
    public void addAtBegining(int data){
        if(this.idx==-1){
            System.out.println("Underflow");
        }
        else{
            idx++;
            for(int i=idx;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=data;
        }
    }
    public void addAtPosition(int data, int pos){
        if(this.size-1==this.idx){
            System.out.println("Overflow");
        }
        else{
            idx++;
            for(int i=idx; i>pos; i--){
                arr[i]=arr[i-1];
            }
            arr[pos-1]=data;
        }
    }
    public void display(){
        if(idx<0){
            System.out.println("Underflow");
            return;
        }
        else{
            for(int i=0; i<idx;idx++){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args){
        Insertion list= new Insertion();
        list.addAtBegining(23);
        list.addAtLast(45);
        list.addAtPosition(56, 3);
        list.display();
    }
}
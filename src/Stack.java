public class Stack {
    private final int maxSize;
    private final Integer[] stackData;
    private int top;

    public Stack(int size){
        this.maxSize=size;
        this.stackData = new Integer[maxSize];
        this.top=-1;
    }

    public boolean isEmpty(){
        return this.top==-1;
    }
    public boolean isFull(){
        return this.top==this.maxSize-1;
    }
    public void push(int data){
        if(this.isFull()){
            System.out.println("Stack overflow");
            return;
        }
        this.stackData[++this.top]=data;
    }
    public int peak(){
        if(this.isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return stackData[top];
    }
    public int pop(){
        if(this.isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return stackData[top--];
    }
    public void display(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Printing stack");
        for(int i=0; i<this.top+1; i++){
            System.out.print(this.stackData[i]+" ");
        }
        System.out.println(" ");
    }
}
class test{
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.display();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.display();
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.peak());
        stack.display();
    }
}

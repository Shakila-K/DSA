public class Queue{
    private int maxSize;
    private int head;
    private int tail;
    private int count;
    private Integer[] queue;

    public Queue(int x){
        this.maxSize=x;
        this.queue = new Integer[maxSize];
    }

    public Boolean isFull(){
        return this.count==this.maxSize;
    }

    public Boolean isEmpty(){
        return this.count==0;
    }

    public void Enquee(int data){
        if(this.isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(this.isEmpty()){
            this.head=this.tail=0;
        }
        else{
            this.tail=(this.tail+1)%this.maxSize;
        }
        this.queue[this.tail]=data;
        this.count++;
    }

    public int Dequee(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data = this.queue[this.head];
        if(this.count==1){
            this.head=this.tail=-1;
        }
        else {
            this.head= (this.head+1)%this.maxSize;
        }
        this.count--;
        return data;
    }

    public int peak(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return this.queue[this.head];
    }

    public void display(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Printing queue");
        for(int x=0; x<this.count; x++){
            System.out.print(this.queue[(this.head+x)%this.maxSize]+" ");
        }
        System.out.println(" ");
    }
}

class testQueue{
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.Enquee(1);
        queue.Enquee(2);
        queue.Enquee(3);
        queue.Enquee(4);
        queue.Enquee(5);
        queue.Enquee(6);

        queue.display();
        System.out.println(queue.Dequee());
        queue.display();
        System.out.println(queue.Dequee());
        queue.display();
        System.out.println(queue.Dequee());
        queue.display();
        System.out.println(queue.Dequee());
        queue.display();
        System.out.println(queue.Dequee());
        queue.display();
        System.out.println(queue.Dequee());
        queue.display();
    }
}

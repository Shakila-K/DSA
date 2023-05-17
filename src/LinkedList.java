public class LinkedList {

    private LinkNode head;
    private LinkNode tail;

    static class LinkNode{
        private int data;
        private LinkNode next;

        public LinkNode(int data){
            this.data=data;
        }

        public int getData(){
            return this.data;
        }

        public LinkNode getNext(){
            return this.next;
        }

        public void setNext(LinkNode next) {
            this.next = next;
        }
    }

    public LinkNode getHead(){
        return this.head;
    }
    public LinkNode getTail(){
        return this.tail;
    }
    public boolean isEmpty(){
        return this.head==null;
    }

    public void addToHead(int data){
        LinkNode node = new LinkNode(data);
        if(this.isEmpty()){
            this.head=this.tail=node;
            return;
        }
        node.setNext(this.head);
        this.head=node;
    }

    public void addToTail(int data){
        LinkNode node = new LinkNode(data);
        this.tail.setNext(node);
        this.tail=node;
    }

    public void deleteFromHead(){
        if (this.isEmpty()){
            System.out.println("Linked List is empty");
            return;
        }
        this.head=this.head.getNext();
        if (this.head==null){
            this.tail=null;
        }
    }

    public void deleteFromTail(){
        if (this.isEmpty()){
            System.out.println("Linked List is empty");
            return;
        }
        if (this.head==this.tail){
            this.head=this.tail=null;
        }
        LinkNode current = this.head;
        while(current!=null){
            if (current.getNext()==this.tail){
                current.setNext(null);
                this.tail=current;
                return;
            }
            current = current.getNext();

        }
    }


}

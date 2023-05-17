import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BSTree {
    private Node Root;

    public Node getRoot() {
        return Root;
    }

    public void setRoot(Node root) {
        Root = root;
    }


    public void PreOrderIterative(){
        Stack<Node> stack = new Stack<Node>();
        stack.push(this.getRoot());
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            System.out.print(temp.getData()+ " ");

            if(temp.getRight()!=null){
                stack.push(temp.getRight());
            }
            if(temp.getLeft()!=null){
                stack.push(temp.getLeft());
            }
        }
        System.out.println(" ");
    }

    public void PreOrderRecursive(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.getData()+" ");
        PreOrderRecursive(node.getLeft());
        PreOrderRecursive(node.getRight());
    }

    public void PostOrderRecursive(Node node){
        if(node==null){
            return;
        }
        PostOrderRecursive(node.getLeft());
        PostOrderRecursive(node.getRight());
        System.out.print(node.getData()+" ");
    }

    public void InOrderRecursive(Node node){
        if(node==null){
            return;
        }
        InOrderRecursive(node.getLeft());
        System.out.print(node.getData()+" ");
        InOrderRecursive(node.getRight());
    }

    public void BreadthFirstTraversal(){
        if (this.getRoot()==null){
            System.out.println("Empty tree");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.getRoot());
        while(!queue.isEmpty()){
            Node curr = queue.remove();
            System.out.print(curr.getData()+ " ");
            if(curr.getLeft()!=null){
                queue.add(curr.getLeft());
            }
            if(curr.getRight()!=null){
                queue.add(curr.getRight());
            }
        }
        System.out.println(" ");
    }
}

class Node{
    private Node Left;
    private Node Right;
    private Integer Data;

    public Node getLeft() {
        return Left;
    }

    public void setLeft(Node left) {
        Left = left;
    }

    public Node getRight() {
        return Right;
    }

    public void setRight(Node right) {
        Right = right;
    }

    public Integer getData() {
        return Data;
    }

    public void setData(Integer data) {
        Data = data;
    }

    public Node(Integer data){
        this.Data=data;
    }
}


class Main{
    public static void main(String[] args) {
        BSTree tree = new BSTree();

        tree.setRoot(new Node(5));

        tree.getRoot().setLeft(new Node(2));
        tree.getRoot().setRight(new Node(9));

        tree.getRoot().getLeft().setLeft(new Node(1));
        tree.getRoot().getLeft().setRight(new Node(3));

        tree.getRoot().getRight().setLeft(new Node(6));
        tree.getRoot().getRight().setRight(new Node(10));

//        tree.PreOrderIterative();
        tree.PreOrderRecursive(tree.getRoot());
        System.out.println(" ");
        tree.PostOrderRecursive(tree.getRoot());
        System.out.println(" ");
        tree.InOrderRecursive(tree.getRoot());
        System.out.println(" ");
        tree.BreadthFirstTraversal();
    }
}
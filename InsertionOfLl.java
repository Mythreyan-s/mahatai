
class Node{
    int val;
    Node next;

    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }

    Node(int val){
        this.val=val;
        this.next=null;
    }
}



public class InsertionOfLl {

    public static Node Arrtoll(int[] arr){
        Node head = new Node(arr[0]);
        Node mover =head;
    for(int i=1;i<arr.length;i++){
          Node temp = new Node(arr[i]);
          mover.next = temp;
          mover = temp;
    }
    return head;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        Node head = Arrtoll(arr);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+ "->");
            temp=temp.next;
        }
    }
}

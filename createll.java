
 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };



public class Solution {
    public static Node constructLL(int []arr) {
        // Write your code here
        int n=arr.length;
        Node head=null;
        Node current=null;
        for(int i=0;i<n;i++){
            Node newNode=new Node(arr[i]);
            if(head==null){
                head=newNode;
                current=head;
            }
            else{
                current.next=newNode;
                current=current.next;
            }
        }
        return head;
    }
}
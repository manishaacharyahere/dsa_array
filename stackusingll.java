public class Solution {
    static class Stack {
        //Write your code here
        static Node head;
        static int size;

        Stack()
        {
            //Write your code here
            head=null;
            size=0;
        }

        int getSize()
        {
            //Write your code here
            return size;
        }

        boolean isEmpty()
        {
            //Write your code here
            return head==null;
        }

        void push(int data)
        {
            //Write your code here
            Node temp=new Node(data);
            temp.next=head;
            size++;
            head=temp;
        }

        void pop()
        {
            //Write your code here
            if(head==null){
                return -1;
            }
            int val=head.data;
            size--;
            head=head.next;
            return val;

        }

        int getTop()
        {
            //Write your code here
            if(head==null){
                return -1;
            }
            return head.data;
        }
    }
}

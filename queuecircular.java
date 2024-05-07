public class Solution {
    class Queue {
        int front, rear;
        int []arr;
        int n;
        int c;

        Queue() {
            front = 0;
            rear = 0;
            arr = new int[100001];
            n=arr.length;
            c=0;
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            // Write your code here.
            if(c==n){
                return ;
            }
            arr[rear%n]=e;
            rear++;
            c++;
        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
            // Write your code here.
            if(c==0){
                return -1;
            }
            int a=arr[front%n];
            front++;
            c--;
            return a;
        }
    }
}
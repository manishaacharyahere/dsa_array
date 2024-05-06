public class Solution{
    static class Stack {
        int capacity=0;
        int [] arr;
        int top;
        Stack(int capacity) {
            // Write your code here.
            this.capacity=capacity;
            this.arr=new int[capacity];
            this.top=-1;

        }
        public void push(int num) {
            // Write your code here.
            if(isFull()==1){
                return;
            }
            top++;
            arr[top]=num;
        }
        public int pop() {
            // Write your code here.
            if(isEmpty()==1){
                return -1;
            }
            return arr[top--];
        }
        public int top() {
            // Write your code here.
            if(isEmpty()==1){
                return -1;
            }
            return arr[top];
        }
        public int isEmpty() {
            // Write your code here.
            if(top==-1){
                return 1;
            }
            return 0;
        }
        public int isFull() {
            // Write your code here.
            if (top==capacity-1){
                return 1;
            }
            return 0;
        }
    }
}
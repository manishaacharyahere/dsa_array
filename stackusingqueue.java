import java.util.*;
public class Solution{
    static class Stack {
          Queue<Integer>q=new LinkedList<>();
          public Stack() {
        }
          public int getSize() {
            return q.size();
        }
        public boolean isEmpty() {
             return q.isEmpty();
        }
        public void push(int element) {
             q.add(element);
               for(int i=0;i<q.size()-1;i++){
                     q.add(q.remove());
                      }
         }
         public int pop() {
             return q.size()==0?-1:q.remove();
        }
        public int top() {
            return q.size()==0?-1:q.peek();
        }
    }
}
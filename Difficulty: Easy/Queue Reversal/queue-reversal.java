class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> s=new Stack<Integer>();
        while(!queue.isEmpty()){
            s.push(queue.poll());
        }
        while(!s.isEmpty()){
            queue.offer(s.pop());
        }
        return queue;
    }
}
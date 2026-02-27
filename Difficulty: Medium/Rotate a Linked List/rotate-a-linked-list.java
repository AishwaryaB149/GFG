/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        if(head==null || k==0){
            return head;
        }
       //1.Find the length of list
       Node curr=head;
       int len=1;
       while(curr.next!=null){
           curr=curr.next;
           len=len+1;
       }
       //2.Reduce k using modulo
       k=k%len;
       if(k==0){
           return head;
       }
       //3.make list circular
       curr.next=head;
       //4.Move to kth node
       curr=head;
       for(int i=1;i<k;i++){
           curr=curr.next;
       }
       //5.Update new head
       head=curr.next;
       //6. break the circular link
       curr.next=null;
       return head;
    }
}


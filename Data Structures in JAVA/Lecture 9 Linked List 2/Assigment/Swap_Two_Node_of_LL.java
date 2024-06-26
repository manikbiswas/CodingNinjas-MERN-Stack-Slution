/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

    public static LinkedListNode<Integer> findPrevNode(LinkedListNode<Integer> head, int count)
        {
            for (int i=0;i<count-1;i++)
            {
                head=head.next;
            }
            return head;
        }
        public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
            
             if (head==null)
            {
                return head;
            }
            else if (j==0 || (i-j==-1))
            {
                int temp=i;
                i=j;
                j=temp;
            }
            
            LinkedListNode<Integer> swap1=null,swap2=null,p1=null,n1=null,p2=null,n2=null;
            
            if (i==0 && i-j==1)
            {
                swap1=head;
                swap2=head.next;
    
                swap1=swap1.next;
                head=swap2;
                swap2.next=swap1;
                
            }
            else if(i-j==1)
            {
                p1=findPrevNode(head,j);
                swap1=p1.next;
                swap2=swap1.next;
                n2=swap2.next;
               
                
                p1.next=swap2;
                swap2.next=swap1;
                swap1.next=n2;
                
            }
            else if (i==0)
            {
                swap1=head;
                n1=swap1.next;
                p2=findPrevNode(head,j);
                swap2=p2.next;
                n2=swap2.next;
                
                head=swap2;
                head.next=n1;
                p2.next=swap1;
                swap1.next=n2;
                
            }
            else
            {
                p1=findPrevNode(head,i);
                p2=findPrevNode(head,j);
                swap1=p1.next;
                swap2=p2.next;
                n1=swap1.next;
                n2=swap2.next;
            
                p1.next=swap2;
                p2.next=swap1;
                swap1.next=n2;
                swap2.next=n1;
            }
            
            
            return head;
        }
    
    }
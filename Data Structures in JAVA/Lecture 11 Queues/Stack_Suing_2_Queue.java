import java.util.*;
public class Stack {

    //Define the data members
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int size;


    public Stack() {
        //Implement the Constructor
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>();
        size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size==0;
    }

    public void push(int element) {
        //Implement the push(element) function
        q1.add(element);     
        size=size+1;
    }

    public int pop() {
        //Implement the pop() function
       if (q1.isEmpty())
       {
           return -1;
       }
       while(q1.size()!=1)
       {
           q2.add(q1.remove());
       }
       int top=q1.remove();
        
       while(!q2.isEmpty())
       {
           q1.add(q2.remove());
       }
       size=size-1;
        return top;
    }

    public int top() {
        //Implement the top() function
        if (q1.isEmpty())
       {
           return -1;
       }
       while(q1.size()!=1)
       {
           q2.add(q1.remove());
       }
       int top=q1.peek();
       q2.add(q1.remove());
       
       Queue<Integer> q=q1;
       q1=q2;
       q2=q;
       return top;
    }
}
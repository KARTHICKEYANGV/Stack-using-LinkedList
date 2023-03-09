/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Stack
{
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(10);
		stack.push(11);
		System.out.print(stack.pop());
		
	}
	public class Node{
	    int data;
	    Node next;
	    Node(int val){
	        data=val;
	        next=null;
	    }
	}
	Node head;
	Stack(){
	    head=null;
	}
	public void push(int data){
	    Node newNode=new Node(data);
	    newNode.next=head;
	    head=newNode;
	}
	public int pop(){
	    int temp=head.data;
	    head=head.next;
	    return temp;
	    
	}
	public int peek(){
	    return head.data;
	}
	
}

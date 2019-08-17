
public class Main
{
    private class Node{
        int data;
        Node next;
    }
    Node top;
    Main(){
        this.top=null;
    }
    public void push(int x){
        Node temp=new Node();
        if(temp==null){
            System.out.println("Stack Overflow!!");
            return ;
        }
        temp.data=x;
        temp.next=top;
        top=temp;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public int peek(){
        if(!isEmpty()){
            return top.data;
        }
        else{
            System.out.println("Stack is empty!!");
            return 1;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("Stack underflow!!");
            return;
        }
        top=top.next;
    }
    public void display(){
        if(top==null)
            return ;
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
            
    }
    
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Main obj=new Main();
		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);
		obj.display();
		System.out.println();
		System.out.println("Element at the top is:"+ obj.peek());
		obj.pop();
		obj.pop();
		obj.display();
			System.out.println();
		System.out.println("Element at the top is:"+ obj.peek());
		
	}
}

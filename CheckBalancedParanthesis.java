
public class CheckBalancedParanthesis{
 static class Stack{
    int top=-1;
    char items[]=new char[100];
    void push(char x){
        if(top==100){
            System.out.println("Stack Overflow!!");
        }
        else{
            items[++top]=x;
        }
    }
    char pop(){
        if(top==-1){
            System.out.println("Statck underflow!!!!try again!");
            return '\0';
            
        }
        else{
            char a=items[top];
            top--;
            return a;
        }
    }
     boolean isEmpty(){
        return (top==-1)?true:false;
    }
}
public static boolean isMatchingPair(char ch1,char ch2){
    if(ch1=='(' && ch2==')')
        return true;
    else if(ch1=='{' && ch2=='}')
        return true;
    else if(ch1=='[' && ch2==']')
        return true;
    else
        return false;
}
public static boolean checkParanthesis(char exp[]){
    Stack st=new Stack();   
    for(int i=0;i<exp.length;i++){
        if(exp[i]=='(' || exp[i]=='[' || exp[i]=='{')
            st.push(exp[i]);
         if(exp[i]==')' || exp[i]==']' || exp[i]=='}') 
         {
             if(st.isEmpty())
                return false;
            
            if(!isMatchingPair(st.pop(),exp[i]))
                return false;
         }
    }
    if(st.isEmpty())
        return true;
    else
        return false;
    
}
	public static void main(String[] args) {
		 char exp[] = {'{','}','[',']'}; 
          if (checkParanthesis(exp)) 
            System.out.println("Balanced "); 
          else
            System.out.println("Not Balanced "); 
	}
}

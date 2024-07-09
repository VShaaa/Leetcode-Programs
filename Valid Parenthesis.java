import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(isValid(str));
	}
	public static boolean isValid(String str){
	    Stack<Character> stack=new Stack<>();
	    for(char c:str.toCharArray()){
	        if(c=='('){
	            stack.push(')');
	        }
	        else if(c=='{'){
	            stack.push('}');
	        }
	        else if(c=='['){
	            stack.push(']');
	        }
	        else if(stack.isEmpty() || stack.pop()!=c){
	            return false;
	        }
	            
	        return true;
	    }
	    return str.isEmpty();
	}
}
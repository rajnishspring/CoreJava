import java.util.Stack;

public class Paranthesis {
    public static boolean areParenthesesNested(String parenthesesString) {
        Stack<Character> stack = new Stack<>();

        for (char c : parenthesesString.toCharArray()) {
            if (c == '(') {
                stack.push(c); // Push opening parentheses onto the stack
               
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                	
                	//stack.pop();
                    return false; // Closing parentheses found without a corresponding opening parentheses
                }
            }
        }
//|| stack.pop() != '('
        return stack.isEmpty(); // If the stack is empty, all parentheses have been matched
    }

    public static void main(String[] args) throws InterruptedException {
        String testString1 = "()"; // Correctly nested parentheses
        String testString2 = "(()())"; // Incorrectly nested parentheses

      //  System.out.println(areParenthesesNested(testString1)); // Output: true
       System.out.println(areParenthesesNested(testString2)); // Output: false
        
        Stack<Character> stack = new Stack<>();
        stack.push('1');
        stack.push('4');
        stack.push('3');
        System.err.println(stack.size());
        Thread.sleep(222);
        if(stack.pop()=='2')
        {
        	System.out.println("2323");
        }
     System.err.println("last========="+stack.lastElement());
        Thread.sleep(222);
        System.err.println(stack.size());

    }
}

/*
 * Explanation:
 * 
 * We create a stack to keep track of the opening parentheses encountered. We
 * iterate through each character in the parenthesesString. If we encounter an
 * opening parentheses '(', we push it onto the stack. If we encounter a closing
 * parentheses ')', we check if the stack is empty or if the top of the stack
 * contains an opening parentheses '('. If the stack is empty or the top of the
 * stack is not an opening parentheses, it means there is no corresponding
 * opening parentheses for the closing parentheses, and we return false.
 * Otherwise, we pop the opening parentheses from the stack. After iterating
 * through all the characters, we check if the stack is empty. If the stack is
 * empty, it means all opening parentheses have been matched, and we return
 * true. If the stack is not empty, it means there are unmatched opening
 * parentheses, and we return false. In the example above, the function
 * areParenthesesNested is called with two test strings. The first string ((()))
 * contains correctly nested parentheses, so the function returns true. The
 * second string (())) contains incorrectly nested parentheses, so the function
 * returns false.
 * 
 * Feel free to modify the code according to your requirements or use it as a
 * reference to implement the logic in another programming language.
 */







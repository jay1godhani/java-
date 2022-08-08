package calculater;

import java.util.Stack;

public class PostfixCalculator
{
	static double evaluatePostfix(String exp)
    {
        Stack<Double> stack=new Stack<>();
         
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
    
            if(Character.isDigit(c))
            stack.push((double)c - '0');
             
            else
            {
                double val1 = stack.pop();
                double val2 = stack.pop();
                 
                switch(c)
                {
                    case '+':
                    stack.push(val2+val1);
                    break;
                     
                    case '-':
                    stack.push(val2- val1);
                    break;
                     
                    case '/':
                    stack.push(val2/val1);
                    break;
                     
                    case '*':
                    stack.push(val2*val1);
                    break;
              }
            }
        }
        return stack.pop();   
    }
     
    public static void main(String[] args)
    {
        String exp="17/";
        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
    }
}

import java.util.*;
import java.io.*;
public class InfixEvaluation
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String expression = br.readLine();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i=0;i<expression.length();i++)
        {
            char ch = expression.charAt(i);

            if (ch=='(')
            {
                operators.push(ch);
            }
            if (Character.isDigit(ch))
            {
                operands.push(ch-'0'); // converting char to int
            }
            if (ch==')')
            {
                // ch is wanting higher priority operators to solve first
                while (operators.peek()!='(')
                {
                    char op = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int opval = operation(v1,v2,op);
                    operands.push(opval);
                } operators.pop();
            }
            if (ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                while (operators.size()>0 && operators.peek()!='(' && precedence(ch)<=precedence(operators.peek()))
                {
                    char op = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    int opval = (char) operation(v1,v2,op);
                    operands.push(opval);
                }
            }
            while (operators.size()!=0)
            {
                char op = operators.pop();
                int v2 = operands.pop();
                int v1 = operands.pop();

                int opval = (char) operation(v1,v2,op);
                operands.push(opval);
            } operators.pop();
        }
        System.out.println(operands.peek());
    }
    public static int precedence(char op)
    {
        if (op == '+')
            return 1;
        if (op == '-')
            return 1;
        if (op == '*')
            return 2;
        if (op =='/')
            return 2;
        return 0;
    }
    public static int operation(int v1, int v2, char op)
    {
        if (op == '+')
            return v1+v2;
        if (op == '-')
            return v1-v2;
        if (op == '*')
            return v1*v2;
        if (op =='/')
            return v1/v2;
        return v1;
    }
}
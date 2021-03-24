import java.util.*;
public class ArraytoStack
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String array = sc.nextLine();
        Stack <String> stack = new Stack<>();
        for (int i=0;i<array.length();i++){
            stack.add(array);
            break;
        }
        System.out.println(stack);
    }
}
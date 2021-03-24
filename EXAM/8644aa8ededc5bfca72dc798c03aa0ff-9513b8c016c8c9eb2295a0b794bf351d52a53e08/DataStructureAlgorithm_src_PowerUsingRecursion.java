import java.util.*;
public class PowerUsingRecursion
{
    public static int power(int base, int power)
    {
        if (power==0)
        {
            return 1;
        }
        return(base * power(base,power-1) );
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int base,power;
        base = sc.nextInt();
        power = sc.nextInt();
        System.out.println(power(base,power));
    }
}
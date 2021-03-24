import java.util.*;
public class blank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch);
        }
        else {
            System.out.println("Wrong Choice");
        }
    }
}



/**
 * Write a description of class GCD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GCD
{
    private int num1, num2;
    public static void main (String args[]){
        System.out.println("yo mama");
        System.out.println(gcd(1,3));
        System.out.println(gcd(27,3));
        System.out.println(gcd(27,9));
        System.out.println(gcd(30,12));
        System.out.println(gcd(12,30));
    }
    public static int gcd(int num1, int num2){
        if (num2 <= num1 && num1%num2 == 0)
            return num2;
        else if (num1 < num2)
            return gcd(num2, num1);
        else
            return gcd(num2, num1%num2);
            
    }
}

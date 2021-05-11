
/**
 * Write a description of class RecursivePair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecursivePair
{
    public static void func1(int x)
    {
        if (x==0) {
            System.out.print("0 ");
            return;
        }
        else{
            System.out.print(x + " ");
            recursionPrint(x-1);
        }
    }
    public static String func3(String wow){ //reverses a string
        if (wow.length()>0){
            return wow.charAt(wow.length()-1) + 
            func3(wow.substring(0, wow.length()-1));
        }
        else
        return "";
    }
    public static void recursionPrint(int x){
        if (x==0) {
            System.out.print("0 ");
            return;
        }
        else {
           recursionPrint(x-1);
           System.out.print(x + " ");
           return;
        }
        
    }
    public static String isPrime(int x){
        int orig = x;
        if (orig%(x-1) == 0)
            return "Not Prime";
        else {
            isPrime(x-1);
            return "Prime";
        }
        
    }
    public static double fibo(double n){
        if (n>1)
            return fibo(n-2) + fibo(n-1);
        return -1;
    }
    public static void main (String args[]){
        recursionPrint(15);
        //System.out.print(Prime(15));
    }
}

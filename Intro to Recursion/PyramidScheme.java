
/**
 * fundraiser with recursion
 *
 * @author (Lucas Cheng)
 * @version (5/11/2021)
 */
public class PyramidScheme
{
    public static void main (String[] args){
        System.out.println(collect(100));
        System.out.println(collect(1000));
        System.out.println(collect(200));
        System.out.println(collect(500));
    }
    public static int collect(int monetaryGoal) {
        if (monetaryGoal <=1)
            return 1;
        else {            
            return collect(monetaryGoal/10) +
                   collect(monetaryGoal/10) +
                   collect(monetaryGoal/10) +
                   collect(monetaryGoal/10) +
                   collect(monetaryGoal/10) +
                   collect(monetaryGoal/10) +
                   collect(monetaryGoal/10) +
                   collect(monetaryGoal/10) +
                   collect(monetaryGoal/10) +
                   collect(monetaryGoal/10);
              
        }
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arceium
{
    public  static int attack(List<Integer> boats)
    {
        int n = boats.size();
        int even = 0;
        int odd = 0;
        int result = 0;
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                even += boats.get(i);
            }
            else
            {
                odd += boats.get(i);
            }
        }
        return Math.max(even,odd);
    }
    public static void main(String[] args)
    {
        List<Integer> boats = new ArrayList<>();
        boats.add(3);
        boats.add(8);
        boats.add(10);
        boats.add(4);
        boats.add(2);
        System.out.println(attack(boats));
    }
}

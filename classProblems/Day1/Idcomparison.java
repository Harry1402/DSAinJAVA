
import java.util.Comparator;

public class Idcomparison implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id - o2.id; 
    }

}
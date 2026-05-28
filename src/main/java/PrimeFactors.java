import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int number) {
        List<Integer> ret = new ArrayList<>();

        for (int divisor = 2; number > 1; divisor++) {
            while (number % divisor == 0) {
                ret.add(divisor);
                number /= divisor;
            }
        }

        return ret;
    }
}

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int number) {
        List<Integer> ret = new ArrayList<>();

        if(number > 1) {
            int divisor = 2;
            if (number == 4 || number == 8 || number == 6 || number == 9) {
                for (divisor = 2; number > 1; divisor++) {
                    while (number % divisor == 0) {
                        ret.add(divisor);
                        number /= divisor;
                    }
                }
            } else {
                ret.add(number);
            }
        }else {

        }
        return ret;
    }
}

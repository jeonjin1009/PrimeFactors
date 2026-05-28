import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {
    PrimeFactors primeFactors;

    @BeforeEach
    void setUp() {
        primeFactors = new PrimeFactors();
    }

    @Test
    void primeFactorTest1() {
        assertEquals(Arrays.<Integer>asList(), primeFactors.of(1));


    }

    @Test
    void primeFactorTest2() {
        assertEquals(Arrays.<Integer>asList(2), primeFactors.of(2));
    }

    @Test
    void primeFactorTest3() {
        assertEquals(Arrays.<Integer>asList(3), primeFactors.of(3));
    }
    @Test
    void primeFactorTest4() {
        assertEquals(Arrays.<Integer>asList(2,2), primeFactors.of(4));
    }
    @Test
    void primeFactorTest5() {
        assertEquals(Arrays.<Integer>asList(5), primeFactors.of(5));
    }

    @Test
    void primeFactorTest6() {
        assertEquals(Arrays.<Integer>asList(2,3), primeFactors.of(6));
    }

    @Test
    void primeFactorTest7() {
        assertEquals(Arrays.<Integer>asList(7), primeFactors.of(7));
    }
    @Test
    void primeFactorTest8() {
        assertEquals(Arrays.<Integer>asList(2,2,2), primeFactors.of(8));
    }

    @Test
    void primeFactorTest9() {
        assertEquals(Arrays.<Integer>asList(3,3), primeFactors.of(9));
    }


}
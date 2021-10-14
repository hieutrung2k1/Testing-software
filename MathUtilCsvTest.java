package Week_6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilCsvTest {
	
	@ParameterizedTest
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	void test(int N, int A, int F, String result) {
		MathUtil util = new MathUtil();
		assertEquals(util.transaction(N, A, F), result);
	}
	
}

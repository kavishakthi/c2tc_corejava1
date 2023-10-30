package test_Junit;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterTest {

	@ParameterizedTest
	@ValueSource(strings = {"cakes", "biscuits", "juices", "rice"})
	
	void endswithS(String s)
	{
		assertTrue(s.endsWith("s"));
	}
}

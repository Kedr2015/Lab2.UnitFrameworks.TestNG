package test.rectangle;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

/**
 * @author Nikita_Varchenko
 * 
 *         Factory method to check the area
 * 
 *         Positive Test
 */
public class FactoryPositiveTest extends RectangleAreaPositiveTest {

    /**
     * factory method
     * 
     * @param sideOne
     *            - side One length
     * @param sideTwo
     *            - side Two length
     */
    @Factory(dataProvider = "Positive")
    public FactoryPositiveTest(double sideOne, double sideTwo) {
	super(sideOne, sideTwo);
    }

    /**
     * These initialization test
     */
    @DataProvider(name = "Positive")
    public static Object[][] getValues() {
	return new Object[][] { new Object[] { 3, 4 }, new Object[] { 0, 0 }, new Object[] { 3, 5 },
		new Object[] { 5, 5, } };
    }
}

package test.rectangle;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class FactoryTest extends RectangleTest {

    /**
     * factory method
     * 
     * @param sideOne
     *            - side One length
     * @param sideTwo
     *            - side Two length
     */
    @Factory(dataProvider = "dp")
    public FactoryTest(double sideOne, double sideTwo) {
	super(sideOne, sideTwo);
    }

    /**
     * These initialization test
     */
    @DataProvider(name = "dp")
    public static Object[][] getValues() {
	return new Object[][] { new Object[] { 3, 4 }, new Object[] { 0, 0 }, new Object[] { 3, 5 },
		new Object[] { 5, 5, }, new Object[] { 1, -1 }, new Object[] { -1, 3 } };
    }
}

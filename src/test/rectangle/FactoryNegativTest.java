package test.rectangle;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class FactoryNegativTest extends RectangleAreaNegativTest {

    /**
     * factory method
     * 
     * @param sideOne
     *            - side One length
     * @param sideTwo
     *            - side Two length
     */
    @Factory(dataProvider = "Negativ")
    public FactoryNegativTest(double sideOne, double sideTwo) {
	super(sideOne, sideTwo);
    }

    /**
     * These initialization test
     */
    @DataProvider(name = "Negativ")
    public static Object[][] getValues() {
	return new Object[][] { new Object[] { 1, -1 }, new Object[] { -1, 3 } };
    }
}

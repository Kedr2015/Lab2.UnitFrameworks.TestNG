package test.circle;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Circle;

/**
 * @author Nikita_Varchenko
 * 
 *         In the class of the object being tested methods of the circle.
 *         Negativ Test
 */
public class CircleLengthNegativTest {
    private GeometricObjects geometOb;
    private Circle circle;

    /**
     * Actions performed before starting the test class Negativ Test
     */
    @BeforeClass
    public void initgeometOb() {
	this.geometOb = new GeometricObjects();
    }

    /**
     * Input validation tests for perimeter
     * 
     * @return These range and rounding marks
     */
    @DataProvider(name = "DataForTest")
    public Object[][] DataArea() {
	return new Object[][] { new Object[] { -1 } };
    }

    /**
     * Test method to check the length
     * 
     * @param radius
     *            - radius
     * @param numberDigitsDecimalPoint
     *            - rounding marks
     */
    @Test(dataProvider = "DataForTest")
    public void checkingLengthCircleTest(double radius) {
	System.out.println("checkingLengthCircleTest test started\n Check areas knit circle with a radius " + radius);
	try {
	    this.circle = geometOb.getCircle(radius);
	} catch (NullPointerException e) {
	    System.out.println("The method fails. The radius of the circle created " + radius);
	}
	Assert.assertEquals(circle.getCircumference(), 0.0,
		"For radius = " + radius + "\nA negative radius, the method considers the perimeter");
	System.out.println("The test successfully completed\n");
    }
}

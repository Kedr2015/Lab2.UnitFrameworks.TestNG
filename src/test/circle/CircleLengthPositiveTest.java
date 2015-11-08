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
 *         Positive Test
 */
public class CircleLengthPositiveTest {
    private GeometricObjects geometOb;
    private Circle circle;
    private double length;

    /**
     * Actions performed before starting the test class Positive Test
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
	return new Object[][] { new Object[] { 4 }, new Object[] { 0 } };
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
	length = Math.PI * 2 * radius;
	Assert.assertEquals(circle.getCircumference(), length, 0.001, "For radius = " + radius
		+ "\nThe test fails, the length or the number of decimal places does not match");
	System.out.println("The test successfully completed");
    }
}

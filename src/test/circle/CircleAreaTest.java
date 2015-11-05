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
 *         In the class of the object being tested methods of the circle, and
 *         the exclusions
 */
public class CircleAreaTest {
    private GeometricObjects geometOb;
    private Circle circle;
    private double area;

    /**
     * Actions performed before starting the test class
     */
    @BeforeClass
    public void initgeometOb() {
	this.geometOb = new GeometricObjects();
    }

    /**
     * Input validation tests for area and perimeter
     * 
     * @return These range and rounding marks
     */
    @DataProvider(name = "DataForTest")
    public Object[][] DataArea() {
	return new Object[][] { new Object[] { 4, 3 }, new Object[] { 0, 3 }, new Object[] { -1, 3 },
		new Object[] { 5, 4 }, new Object[] { 3, 1 }, new Object[] { 5, 0 }, new Object[] { 5, -1 }, };
    }

    /**
     * Test method to check the area
     * 
     * @param radius
     *            - radius
     * @param numberDigitsDecimalPoint
     *            - rounding marks
     */
    @Test(dataProvider = "DataForTest")
    public void checkingAreaCircleTest(double radius, int numberDigitsDecimalPoint) {
	System.out.println("checkingAreaCircleTest test started\n Check areas knit circle with a radius " + radius);
	try {
	    this.circle = geometOb.getCircle(radius);
	} catch (NullPointerException e) {
	    System.out.println("The method fails. The radius of the circle created " + radius);
	}
	area = Math.PI * Math.pow(radius, 2);
	Assert.assertEquals(circle.getSquare(), area,0.0001,
		"For radius = " + radius + " And the number of decimal places " + numberDigitsDecimalPoint
			+ "\nThe test fails, the area or the number of decimal places does not match");
	System.out.println("The test successfully completed");
    }

    

}

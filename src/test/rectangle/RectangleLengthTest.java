package test.rectangle;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

public class RectangleLengthTest {
    private GeometricObjects geometOb;
    private Rectangle rectangle;
    private double perimeter;

    /**
     * Input validation tests for area and perimeter
     * 
     * @return These side length
     */
    @DataProvider(name = "DataForTest")
    public Object[][] DataArea() {
	return new Object[][] { new Object[] { 3, 4 }, new Object[] { 0, 0 }, new Object[] { 3, 5 },
		new Object[] { 5, 5, }, new Object[] { 1, -1 }, new Object[] { -1, 3 } };
    }

    /**
     * Actions performed before starting the test class
     */
    @BeforeClass
    public void initgeometOb() {
	this.geometOb = new GeometricObjects();
    }

    /**
     * Test method to check the length
     * 
     */
    @Test(dataProvider = "DataForTest")
    public void checkingLengthRectangleTest(double sideOne, double sideTwo) {
	System.out.println("checkingLengthRectangleTest test started\nCheck areas knit Rectang with a sideOne "
		+ sideOne + " and sideTwo" + sideTwo);
	try {
	    this.rectangle = geometOb.getRectangle(sideOne, sideTwo);
	} catch (NullPointerException e) {
	    System.out.println(
		    "The method fails. The sideOne of the Rectang created " + sideOne + " and sideTwo " + sideTwo);
	}
	perimeter = 2 * (sideOne + sideTwo);
	Assert.assertEquals(rectangle.getPerimeter(), perimeter, "Rectang with a sideOne " + sideOne + " and sideTwo"
		+ sideTwo + "\nThe test fails, the perimeter  places does not match");
	System.out.println("The test successfully completed");
    }
}

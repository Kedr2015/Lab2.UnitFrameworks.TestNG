package test.quadrate;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;

public class QuadrateLengthTest {

    private GeometricObjects geometOb;
    private Quadrate quadrate;
    private double perimeter;

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
     * @return These side length
     */
    @DataProvider(name = "DataForTest")
    public Object[][] DataArea() {
	return new Object[][] { new Object[] { 4 }, new Object[] { 0 }, new Object[] { -1 }, };
    }

    /**
     * Test method to check the length
     * 
     * @param side
     *            - side length
     */
    @Test(dataProvider = "DataForTest")
    public void checkingLengthCircleTest(double side) {
	System.out.println("CheckingLengthCircleTest test started\n Check areas knit circle with a side " + side);
	try {
	    this.quadrate = geometOb.getQuadrate(side);
	} catch (NullPointerException e) {
	    System.out.println("The method fails. The side of the circle created " + side);
	}
	perimeter = 4 * side;
	Assert.assertEquals(quadrate.getPerimeter(), perimeter,
		"For side = " + side + "\nThe test fails, the length or the number of decimal places does not match");
	System.out.println("The test successfully completed. Perimeter= " + quadrate.getPerimeter() + "\n");
    }
}

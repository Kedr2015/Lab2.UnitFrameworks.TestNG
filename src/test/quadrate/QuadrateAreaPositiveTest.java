package test.quadrate;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;

/**
 * @author Nikita_Varchenko
 * 
 *         In the class of the object being tested methods of the Quadrate
 *         Positive Test
 */
public class QuadrateAreaPositiveTest {
    private GeometricObjects geometOb;
    private Quadrate quadrate;
    private double area;

    /**
     * Actions performed before starting the test class
     */
    @BeforeClass
    public void initgeometOb() {
	this.geometOb = new GeometricObjects();
    }

    /**
     * Input validation tests for area
     * 
     * @return These side length
     */
    @DataProvider(name = "DataForTest")
    public Object[][] DataArea() {
	return new Object[][] { new Object[] { 4 }, new Object[] { 0 } };
    }

    /**
     * Test method to check the area
     * 
     * @param side
     *            - side length
     */
    @Test(dataProvider = "DataForTest")
    public void checkingAreaCircleTest(double side) {
	System.out.println("CheckingAreaCircleTest test started\n Check areas knit circle with a radius " + side);
	try {
	    this.quadrate = geometOb.getQuadrate(side);
	} catch (NullPointerException e) {
	    System.out.println("The method fails. The radius of the circle created " + side);
	}
	area = Math.pow(side, 2);
	Assert.assertEquals(quadrate.getSquare(), area,
		"For side = " + side + "\nThe test fails, the area or the number of decimal places does not match");
	System.out.println("The test successfully completed. Area= " + quadrate.getSquare() + "\n");
    }

}

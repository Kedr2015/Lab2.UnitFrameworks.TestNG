package test.rectangle;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;
/**
 * @author Nikita_Varchenko
 * 
 *         In the class of the object being tested methods of the Rectangle
 * 
 *         It does not work without factory
 *         Negativ Test  
 */

public class RectangleAreaNegativTest {
    private Double sideOne;
    private Double sideTwo;
    private GeometricObjects geometOb;
    private Rectangle rectangle;


    /**
     * The constructor for the factory method
     * 
     * @param sideOne
     *            - side One length
     * @param sideTwo
     *            - side Two length
     */
    public RectangleAreaNegativTest(Double sideOne, Double sideTwo) {
	this.sideOne = sideOne;
	this.sideTwo = sideTwo;
    }

    /**
     * Actions performed before starting the test class
     */
    @BeforeClass
    public void initgeometOb() {
	this.geometOb = new GeometricObjects();
    }

    /**
     * Test method to check the area
     * 
     */
    @Test
    public void checkingAreaRectangleTest() {
	System.out.println("checkingAreaRectangleTest test started\nCheck areas knit Rectang with a sideOne " + sideOne
		+ " and sideTwo" + sideTwo);
	try {
	    this.rectangle = geometOb.getRectangle(sideOne, sideTwo);
	} catch (NullPointerException e) {
	    System.out.println(
		    "The method fails. The sideOne of the Rectang created " + sideOne + " and sideTwo " + sideTwo);
	}
	Assert.assertEquals(rectangle.getSquare(), 0.0,
		"For sideOne = " + sideOne + " and sideTwo " + sideTwo + "\nWhen the negative aspects of the method calculates the value");
	System.out.println("The test successfully completed");
    }
}

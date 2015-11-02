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
 */
public class RectangleTest {
    private Double sideOne;
    private Double sideTwo;
    private GeometricObjects GeometOb;
    private Rectangle rectangle;
    private double area, perimeter;

    /**
     * The constructor for the factory method
     * 
     * @param sideOne
     *            - side One length
     * @param sideTwo
     *            - side Two length
     */
    public RectangleTest(Double sideOne, Double sideTwo) {
	this.sideOne = sideOne;
	this.sideTwo = sideTwo;
    }

    /**
     * Actions performed before starting the test class
     */
    @BeforeClass
    public void initGeometOb() {
	this.GeometOb = new GeometricObjects();
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
	    this.rectangle = GeometOb.getRectangle(sideOne, sideTwo);
	} catch (NullPointerException e) {
	    System.out.println(
		    "The method fails. The sideOne of the Rectang created " + sideOne + " and sideTwo " + sideTwo);
	}
	area = sideOne * sideTwo;
	Assert.assertEquals(rectangle.getSquare(), area,
		"For sideOne = " + sideOne + " and sideTwo" + sideTwo + "\nThe test fails, the area does not match");
	System.out.println("The test successfully completed");
    }

    /**
     * Test method to check the length
     * 
     */
    @Test
    public void checkingLengthRectangleTest() {
	System.out.println("checkingLengthRectangleTest test started\nCheck areas knit Rectang with a sideOne "
		+ sideOne + " and sideTwo" + sideTwo);
	try {
	    this.rectangle = GeometOb.getRectangle(sideOne, sideTwo);
	} catch (NullPointerException e) {
	    System.out.println(
		    "The method fails. The sideOne of the Rectang created " + sideOne + " and sideTwo " + sideTwo);
	}
	perimeter = 2 * (sideOne + sideTwo);
	Assert.assertEquals(rectangle.getPerimeter(), perimeter, "Rectang with a sideOne " + sideOne + " and sideTwo"
		+ sideTwo + "\nThe test fails, the perimeter  places does not match");
	System.out.println("The test successfully completed");
    }

    /**
     * Test method to check the sign square
     * 
     */
    @Test
    public void checkingQuadrateRectangleTest() {
	int compare = Double.compare(sideOne, sideTwo);
	System.out.println("checkingQuadrateRectangleTest test started\nCheck areas knit Rectang with a sideOne "
		+ sideOne + " and sideTwo " + sideTwo);
	try {
	    this.rectangle = GeometOb.getRectangle(sideOne, sideTwo);
	} catch (NullPointerException e) {
	    System.out.println(
		    "The method fails. The sideOne of the Rectang created " + sideOne + " and sideTwo " + sideTwo);
	}
	if (compare == 0) {
	    Assert.assertEquals(rectangle.isQuadrate(), true, "Rectang with a sideOne " + sideOne + " and sideTwo "
		    + sideTwo + "\nThe method attribute of a square does not work properly");
	} else {
	    Assert.assertEquals(rectangle.isQuadrate(), false, "Rectang with a sideOne " + sideOne + " and sideTwo "
		    + sideTwo + "\nThe method attribute of a square does not work properly");
	}
	System.out.println("The test successfully completed");
    }

}

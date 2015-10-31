package geometricObjects.Rectangle.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

public class RectangleTest {
    private Double sideOne;
    private Double sideTwo;
    private GeometricObjects GeometOb;
    private Rectangle rectangle;
    private double area, perimeter;

    public RectangleTest(Double sideOne, Double sideTwo) {
	this.sideOne = sideOne;
	this.sideTwo = sideTwo;
    }

    @BeforeClass
    public void initGeometOb() {
	this.GeometOb = new GeometricObjects();
    }

    @Test
    public void checkingAreaRectangleTest() {
	System.out.println("checkingAreaRectangleTest test started\nCheck areas knit Rectang with a sideOne " + sideOne
		+ " and sideTwo" + sideTwo);
	try {
	    this.rectangle = GeometOb.getRectangle(sideOne, sideTwo);
	} catch (NullPointerException e) {
	    System.out.println(
		    "The method fails. The sideOne of the Rectang created " + sideOne + " and sideTwo" + sideTwo);
	}
	area = sideOne * sideTwo;
	Assert.assertEquals(rectangle.getSquare(), area,
		"For sideOne = " + sideOne + " and sideTwo" + sideTwo + "\nThe test fails, the area does not match");
	System.out.println("The test successfully completed");
    }

    @Test()
    public void checkingLengthRectangleTest() {
	System.out.println("checkingAreaRectangleTest test started\nCheck areas knit Rectang with a sideOne " + sideOne
		+ " and sideTwo" + sideTwo);
	try {
	    this.rectangle = GeometOb.getRectangle(sideOne, sideTwo);
	} catch (NullPointerException e) {
	    System.out.println(
		    "The method fails. The sideOne of the Rectang created " + sideOne + " and sideTwo" + sideTwo);
	}
	perimeter = 2 * (sideOne + sideTwo);
	Assert.assertEquals(rectangle.getPerimeter(), perimeter, "Rectang with a sideOne " + sideOne + " and sideTwo"
		+ sideTwo + "\nThe test fails, the perimeter  places does not match");
	System.out.println("The test successfully completed");
    }

    @Test()
    public void checkingQuadrateRectangleTest() {
	System.out.println("checkingAreaRectangleTest test started\nCheck areas knit Rectang with a sideOne " + sideOne
		+ " and sideTwo" + sideTwo);
	try {
	    this.rectangle = GeometOb.getRectangle(sideOne, sideTwo);
	} catch (NullPointerException e) {
	    System.out.println(
		    "The method fails. The sideOne of the Rectang created " + sideOne + " and sideTwo" + sideTwo);
	}

	Assert.assertTrue(rectangle.isQuadrate() == (sideOne == sideTwo), "Rectang with a sideOne " + sideOne
		+ " and sideTwo" + sideTwo + "\nThe test fails, the rectangle is not a square");
	System.out.println("The test successfully completed");
    }



}

package test.rectangle;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

/**
 * @author Nikita_Varchenko
 * 
 *         In the class of the object being tested methods of the Rectangle.
 *         Positive Test
 */
public class RectangleQuadrateRectanglePositiveTest {

    private GeometricObjects geometOb;
    private Rectangle rectangle;

    @DataProvider(name = "DataForTest")
    public Object[][] DataArea() {
	return new Object[][] { new Object[] { 3, 4 }, new Object[] { 0, 0 }, new Object[] { 3, 5 },
		new Object[] { 5, 5, } };
    }

    /**
     * Actions performed before starting the test class
     */
    @BeforeClass
    public void initGeometOb() {
	this.geometOb = new GeometricObjects();
    }

    /**
     * Test method to check the sign square
     * 
     */
    @Test(dataProvider = "DataForTest")
    public void checkingQuadrateRectangleTest(double sideOne, double sideTwo) {
	int compare = Double.compare(sideOne, sideTwo);
	System.out.println("checkingQuadrateRectangleTest test started\nCheck areas knit Rectang with a sideOne "
		+ sideOne + " and sideTwo " + sideTwo);
	try {
	    this.rectangle = geometOb.getRectangle(sideOne, sideTwo);
	} catch (NullPointerException e) {
	    System.out.println(
		    "The method fails. The sideOne of the Rectang created " + sideOne + " and sideTwo " + sideTwo);
	}
	Assert.assertEquals(rectangle.isQuadrate(), compare == 0, "Rectang with a sideOne " + sideOne + " and sideTwo "
		+ sideTwo + "\nThe method attribute of a square does not work properly");
	System.out.println("The test successfully completed");
    }
}

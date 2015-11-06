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
 *         Negativ Test
 */
public class RectangleQuadrateRectangleNegativTest {
    private GeometricObjects geometOb;
    private Rectangle rectangle;

    @DataProvider(name = "DataForTest")
    public Object[][] DataArea() {
	return new Object[][] { new Object[] { 1, -1 }, new Object[] { -1, 3 } };
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
	System.out.println("checkingQuadrateRectangleTest test started\nCheck areas knit Rectang with a sideOne "
		+ sideOne + " and sideTwo " + sideTwo);
	try {
	    this.rectangle = geometOb.getRectangle(sideOne, sideTwo);
	} catch (NullPointerException e) {
	    System.out.println(
		    "The method fails. The sideOne of the Rectang created " + sideOne + " and sideTwo " + sideTwo);
	}
	Assert.assertEquals(rectangle.isQuadrate(), false, "Rectang with a sideOne " + sideOne + " and sideTwo "
		+ sideTwo + "\nWhen the negative aspects of the method calculates the value");
	System.out.println("The test successfully completed");
    }
}

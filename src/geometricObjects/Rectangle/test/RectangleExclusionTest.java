package geometricObjects.Rectangle.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

public class RectangleExclusionTest {
    private GeometricObjects GeometOb;
    private Rectangle rectangle;
    
    @BeforeClass
    public void initGeometOb() {
	this.GeometOb = new GeometricObjects();
    }
    
    @DataProvider(name = "DataForTest2")
    public Object[][] DataAreaExclusion() {
	return new Object[][] { new Object[] { null, 3 },{3,null} };
    }
    
    @Test(dataProvider = "DataForTest2",expectedExceptions = IllegalArgumentException.class)
    public void checkingAreaCircleTestExclusion(Double sideOne, Double sideTwo) {
	System.out.println("CheckingAreaCircleTest test started\nCheck areas knit Rectang with a sideOne " + sideOne
		+ " and sideTwo" + sideTwo
		+ "\nIf you initialize a null value appears in an exception, the test fails");
	this.rectangle = GeometOb.getRectangle(sideOne, sideTwo);
	System.out.println("The test fails");
    }
    
    
}

package geometricObjects.Quadrate.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;

public class QuadrateTest {
    private GeometricObjects GeometOb;
    private Quadrate quadrate;
    private double area, perimeter;

    @BeforeClass
    public void initGeometOb() {
	this.GeometOb = new GeometricObjects();
    }

    @DataProvider(name = "DataForTest")
    public Object[][] DataArea() {
	return new Object[][] { new Object[] { 4 }, new Object[] { 0 }, new Object[] { -1 }, };
    }

    @DataProvider(name = "DataForTest2")
    public Object[][] DataAreaExclusion() {
	return new Object[][] { new Object[] { null } };
    }

    @Test(dataProvider = "DataForTest")
    public void checkingAreaCircleTest(double side) {
	System.out.println("CheckingAreaCircleTest test started\n Check areas knit circle with a radius " + side);
	try {
	    this.quadrate = GeometOb.getQuadrate(side);
	} catch (NullPointerException e) {
	    System.out.println("The method fails. The radius of the circle created " + side);
	}
	area = Math.pow(side, 2);
	Assert.assertEquals(quadrate.getSquare(), area,
		"For side = " + side + "\nThe test fails, the area or the number of decimal places does not match");
	System.out.println("The test successfully completed. Area= " + quadrate.getSquare() + "\n");
    }

    @Test(dataProvider = "DataForTest")
    public void checkingLengthCircleTest(double side) {
	System.out.println("CheckingLengthCircleTest test started\n Check areas knit circle with a side " + side);
	try {
	    this.quadrate = GeometOb.getQuadrate(side);
	} catch (NullPointerException e) {
	    System.out.println("The method fails. The side of the circle created " + side);
	}
	perimeter = 4 * side;
	Assert.assertEquals(quadrate.getPerimeter(), perimeter,
		"For side = " + side + "\nThe test fails, the length or the number of decimal places does not match");
	System.out.println("The test successfully completed. Perimeter= " + quadrate.getPerimeter() + "\n");
    }

    @Test(dataProvider = "DataForTest2", expectedExceptions = NullPointerException.class)
    public void checkingAreaCircleTestExclusion(Double side) {
	System.out.println("CheckingAreaCircleTest test started\n Check areas knit circle with a side " + side
		+ "\nIf you initialize a null value appears in an exception, the test fails");
	this.quadrate = GeometOb.getQuadrate(side);
	System.out.println("The test fails");
    }

}

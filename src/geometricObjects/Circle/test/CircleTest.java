package geometricObjects.Circle.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Circle;

public class CircleTest {
    private GeometricObjects GeometOb;
    private Circle circle;
    private double area, length;

    @BeforeClass
    public void initGeometOb() {
	this.GeometOb = new GeometricObjects();
    }

    @DataProvider(name = "DataForTest")
    public Object[][] DataArea() {
	return new Object[][] { new Object[] { 4, 3 }, new Object[] { 0, 3 }, new Object[] { -1, 3 },
		new Object[] { 5, 4 }, new Object[] { 3, 1 }, new Object[] { 5, 0 }, new Object[] { 5, -1 }, };
    }

    @DataProvider(name = "DataForTest2")
    public Object[][] DataAreaExclusion() {
	return new Object[][] { new Object[] { null, 3 } };
    }

    @Test(dataProvider = "DataForTest")
    public void checkingAreaCircleTest(double radius, int numberDigitsDecimalPoint) {
	System.out.println("CheckingAreaCircleTest test started\n Check areas knit circle with a radius " + radius);
	try {
	    this.circle = GeometOb.getCircle(radius);
	} catch (NullPointerException e) {
	    System.out.println("The method fails. The radius of the circle created " + radius);
	}
	area = new BigDecimal(((Math.PI * Math.pow(radius, 2))))
		.setScale(numberDigitsDecimalPoint, RoundingMode.HALF_UP).doubleValue();
	Assert.assertEquals(circle.getSquare(), area,
		"For radius = " + radius + " And the number of decimal places " + numberDigitsDecimalPoint
			+ "\nThe test fails, the area or the number of decimal places does not match");
	System.out.println("The test successfully completed");
    }

    @Test(dataProvider = "DataForTest")
    public void checkingLengthCircleTest(double radius, int numberDigitsDecimalPoint) {
	System.out.println("CheckingLengthCircleTest test started\n Check areas knit circle with a radius " + radius);
	try {
	    this.circle = GeometOb.getCircle(radius);
	} catch (NullPointerException e) {
	    System.out.println("The method fails. The radius of the circle created " + radius);
	}
	length = new BigDecimal(((Math.PI * 2 * radius))).setScale(numberDigitsDecimalPoint, RoundingMode.HALF_UP)
		.doubleValue();
	Assert.assertEquals(circle.getCircumference(), length,
		"For radius = " + radius + " And the number of decimal places " + numberDigitsDecimalPoint
			+ "\nThe test fails, the length or the number of decimal places does not match");
	System.out.println("The test successfully completed");
    }

    @Test(dataProvider = "DataForTest2", expectedExceptions = NullPointerException.class)
    public void checkingAreaCircleTestExclusion(Double radius, Integer numberDigitsDecimalPoint) {
	System.out.println("CheckingAreaCircleTest test started\n Check areas knit circle with a radius " + radius
		+ "\nIf you initialize a null value appears in an exception, the test fails");
	this.circle = GeometOb.getCircle(radius);
	System.out.println("The test fails");
    }

}

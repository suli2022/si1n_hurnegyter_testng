import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HurTest {
    Hur hur;

    @BeforeTest
    public void testInit() {
        this.hur = new Hur();
    }
    @Test
    public void testCalcAreaFirst() {        
        double area = hur.calcArea(30, 35, 40, 45);
        double expected = 1374.772708486752;
        Assert.assertEquals(area, expected);        
    }
    @Test
    public void testCalcAreaSecond() {
        double area = hur.calcArea(130, 135, 140, 145);
        double expected = 18874.98344370135;
        Assert.assertEquals(area, expected);        
    }
    @Test
    public void testCalcBadInput1() {
        double area = hur.calcArea(-130, 135, 140, 145);
        double expected = -1;
        Assert.assertEquals(area, expected);        
    }
    @Test
    public void testCalcBadInput2() {
        double area = hur.calcArea(130, -135, 140, 145);
        double expected = -1;
        Assert.assertEquals(area, expected);        
    }
    @Test
    public void testCalcBadInput3() {
        double area = hur.calcArea(130, 135, -140, 145);
        double expected = -1;
        Assert.assertEquals(area, expected);        
    }
    @Test
    public void testCalcBadInput4() {
        double area = hur.calcArea(130, 135, 140, -145);
        double expected = -1;
        Assert.assertEquals(area, expected);        
    }
}

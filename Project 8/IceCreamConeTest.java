import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**This class contains the test parameters 
*for IceCreamCone.
*Nathan Adkins
*/
public class IceCreamConeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
  /**This method test getCount.
  */ 
   @Test public void getCountTest() {
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      testCone.resetCount();
      IceCreamCone testConeCount = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertEquals(1, testConeCount.getCount());
   }
   /**This method tests resetCount.
   */
   @Test public void resetCountTest() {
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0); 
      testCone.resetCount();
      Assert.assertEquals(0, testCone.getCount());
   }
   /**This method tests the equals method 
   *when the output is True.
   */
   @Test public void equalsTestTrue() {
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertEquals(true, testCone.equals(testCone));
   }
   /**This method tests the equals method 
   *when the output is True.
   */
   @Test public void equalsTestHeight() { 
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      IceCreamCone testCone2 = new IceCreamCone("Ex 1", 1.0, 3.0);
      Assert.assertEquals(false, testCone.equals(testCone2)); 
   }
   /**This method tests the equals method 
   *when the output is True.
   */
   @Test public void equalsTestRadius() { 
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      IceCreamCone testCone2 = new IceCreamCone("Ex 1", 2.0, 2.0);
      Assert.assertEquals(false, testCone.equals(testCone2));
   }
   /**This method tests the equals method 
   *when the output is True.
   */
   @Test public void equalsTestString() { 
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      IceCreamCone testCone2 = new IceCreamCone("Ex 11", 2.0, 2.0);
      Assert.assertEquals(false, testCone.equals(testCone2)); 
   }

   /**This method tests the equals method 
   *when the output is True.
   */
   @Test public void equalsTestFalse() { 
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertEquals(false, testCone.equals("Eat Shit JAVA"));
   }
   /**This method tests setLabel when the 
   *output is true. 
   */
   @Test public void setLabelTestTrue() {
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertTrue(testCone.setLabel("Eat Shit JAVA")); 
   }
   /**This method tests setLabel when the 
   *output is false. 
   */
   @Test public void setLabelTestFalse() {
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertFalse(testCone.setLabel(null));
   }
   /**This method tests getLabel in IceCreamCone.
   */
   @Test public void getLabelTest() {
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertEquals("Ex 1", testCone.getLabel());
   }
   /**This method test getRadius in IceCreamCone.
   */
   @Test public void getRadiusTest() {
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertEquals(1.0, testCone.getRadius(), .001);
   }
   /**This method tests setRadius when the 
   *output is true. 
   */
   @Test public void setRadiusTestTrue() {
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertTrue(testCone.setRadius(12));
   }
   /**This method tests setRadius when the 
   *output is false. 
   */
   @Test public void setRadiusTestFalse() {
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertFalse(testCone.setRadius(-12));
   }
   /**This method test the getHeight method in 
   *IceCreamCone. 
   */
   @Test public void getHeightTest() { 
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertEquals(2.0, testCone.getHeight(), 0.001);
   }
   /**This method test setHeight Method in class
   *IceCreamCone when the output is true.
   */
   @Test public void setHeightTestTrue() {
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertTrue(testCone.setHeight(12));
   }
   /**This method test setHeight Method in class
   *IceCreamCone when the output is false.
   */
   @Test public void setHeightTestFalse() {
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertFalse(testCone.setHeight(-12));
   }
   /**This method tests surfaceArea method in 
   *IceCreamCone.
   */
   @Test public void surfaceAreaTest() { 
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertEquals(13.308, testCone.surfaceArea(), 0.01);
   }
   /**This method tests the volume method 
   *in IceCreamCone class. 
   */
   @Test public void volumeTest() { 
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertEquals(4.1887902, testCone.volume(), .00001);
   }
   /**This method tests the toString method in class
   *IceCreamCone.
   */
   @Test public void hashCodeTest() { 
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      int value = testCone.hashCode();
      Assert.assertEquals(0, value, .001);
   }
  /**This method tests the toString method in class
   *IceCreamCone.
   */
   @Test public void toStringTest() {
      IceCreamCone testCone = new IceCreamCone("Ex 1", 1.0, 2.0);
      String expectedOutput = "IceCreamCone \"Ex 1\" with radius = 1.0 "
            + "and height = 2.0 units has:"
            + "\n\tsurface area = 13.308 square units"
            + "\n\tvolume = 4.1887902 cubic units";
      Assert.assertEquals(expectedOutput, testCone.toString());
   }
}
